package ride_hailing_application;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
