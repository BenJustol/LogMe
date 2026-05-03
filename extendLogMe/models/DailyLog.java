package models;

/**
 * DailyLog interface that acts as a parent for TO-DO, Journal, and Secret Journal. Each method must be implemented
 * in each subclass, failure to do so will result in faulty code. Each method are necessary methods that a DailyLog
 * should be able to do.
* */
public interface DailyLog {
    void addEntry(String entry);
    boolean deleteEntry(int index);
    String getEntry(int index);
}
