import java.util.*;

// Singleton Pattern: Centralized Calendar Service
class CalendarService {
    private static CalendarService instance;
    private Map<String, Calendar> calendarMap;

    private CalendarService() {
        calendarMap = new HashMap<>();
    }

    public static CalendarService getInstance() {
        if (instance == null) {
            instance = new CalendarService();
        }
        return instance;
    }

    public Calendar createCalendar(String calendarName, User owner) {
        Calendar calendar = new Calendar(calendarName, owner);
        calendarMap.put(calendar.getCalendarId(), calendar);
        return calendar;
    }

    public Calendar getCalendar(String calendarId) {
        return calendarMap.get(calendarId);
    }
}

// User class
class User {
    private String userId;
    private String name;
    private String email;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Calendar class
class Calendar {
    private String calendarId;
    private String calendarName;
    private User owner;
    private List<Event> events;
    private List<User> sharedUsers;
    private Map<User, Permission> userPermissions;

    public Calendar(String calendarName, User owner) {
        this.calendarId = UUID.randomUUID().toString();
        this.calendarName = calendarName;
        this.owner = owner;
        this.events = new ArrayList<>();
        this.sharedUsers = new ArrayList<>();
        this.userPermissions = new HashMap<>();
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void shareCalendar(User user, Permission permission) {
        sharedUsers.add(user);
        userPermissions.put(user, permission);
    }
}

// Event class
class Event {
    private String eventId;
    private String title;
    private Date startTime;
    private Date endTime;
    private List<User> attendees;
    private Location location;
    private List<Reminder> reminders;
    private RecurrenceStrategy recurrenceStrategy;

    public Event(String title, Date startTime, Date endTime, RecurrenceStrategy recurrenceStrategy) {
        this.eventId = UUID.randomUUID().toString();
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.recurrenceStrategy = recurrenceStrategy;
        this.attendees = new ArrayList<>();
        this.reminders = new ArrayList<>();
    }

    public void addAttendee(User attendee) {
        attendees.add(attendee);
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void sendReminders() {
        for (Reminder reminder : reminders) {
            reminder.notifyUser();
        }
    }
}

// Location class
class Location {
    private String address;
    private String latitude;
    private String longitude;

    public Location(String address, String latitude, String longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

// RecurrenceStrategy (Strategy Pattern)
interface RecurrenceStrategy {
    void applyRecurrence(Event event);
}

class DailyRecurrence implements RecurrenceStrategy {
    @Override
    public void applyRecurrence(Event event) {
        System.out.println("Recurring event set daily.");
    }
}

class WeeklyRecurrence implements RecurrenceStrategy {
    @Override
    public void applyRecurrence(Event event) {
        System.out.println("Recurring event set weekly.");
    }
}

// Reminder Factory (Factory Pattern)
abstract class Reminder {
    protected String reminderTime;

    public Reminder(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    abstract void notifyUser();
}

class EmailReminder extends Reminder {
    private User user;

    public EmailReminder(User user, String reminderTime) {
        super(reminderTime);
        this.user = user;
    }

    @Override
    void notifyUser() {
        System.out.println("Sending email reminder to: " + user.getEmail() + " at " + reminderTime);
    }
}

class SMSReminder extends Reminder {
    private User user;

    public SMSReminder(User user, String reminderTime) {
        super(reminderTime);
        this.user = user;
    }

    @Override
    void notifyUser() {
        System.out.println("Sending SMS reminder to: " + user.getName() + " at " + reminderTime);
    }
}

// Permission Enum
enum Permission {
    VIEW_ONLY,
    EDIT,
    ADMIN
}

// Main class to demonstrate LLD
public class GoogleCalendarLLD {
    public static void main(String[] args) {
        CalendarService calendarService = CalendarService.getInstance();
        
        // Create users
        User user1 = new User("1", "Alice", "alice@example.com");
        User user2 = new User("2", "Bob", "bob@example.com");
        
        // Create a calendar for Alice
        Calendar aliceCalendar = calendarService.createCalendar("Alice's Calendar", user1);

        // Create an event for Alice
        RecurrenceStrategy dailyRecurrence = new DailyRecurrence();
        Event event1 = new Event("Meeting with Bob", new Date(), new Date(), dailyRecurrence);
        event1.addAttendee(user2);

        // Add event to Alice's calendar
        aliceCalendar.addEvent(event1);

        // Set reminders
        Reminder emailReminder = new EmailReminder(user2, "10 minutes before");
        event1.addReminder(emailReminder);
        
        // Share the calendar
        aliceCalendar.shareCalendar(user2, Permission.EDIT);

        // Send reminders
        event1.sendReminders();
    }
}
