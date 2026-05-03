package models;

public class Journal implements DailyLog{
    @Override
    public void addEntry(String entry) {

    }

    @Override
    public boolean deleteEntry(int index) {
        return false;
    }

    @Override
    public String getEntry(int index) {
        return "";
    }
}
