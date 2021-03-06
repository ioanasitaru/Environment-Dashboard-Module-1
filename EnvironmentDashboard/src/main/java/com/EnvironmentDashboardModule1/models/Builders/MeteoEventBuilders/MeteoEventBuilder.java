package com.EnvironmentDashboardModule1.models.Builders.MeteoEventBuilders;

import com.EnvironmentDashboardModule1.models.Builders.EventBuilders.EventBuilder;
import com.EnvironmentDashboardModule1.models.MeteoEvents.MeteoEvent;

import java.util.Date;

/**
 * Created by Ariana on 5/3/2017.
 */

//Dragos -> refactorization: renamed from MeteoBuilder to MeteoEventBuilder
public class MeteoEventBuilder extends EventBuilder{

    private Integer temperature;

    private Integer humidity;

    private Integer precipitationLevel;

    public MeteoEventBuilder setName(String name) {
        validateString(name);
        this.name = name;
        return this;
    }

    public MeteoEventBuilder setLatitude(Double latitude) {
        validateLatitude(latitude);
        this.latitude = latitude;
        return this;
    }

    public MeteoEventBuilder setLongitude(Double longitude) {
        validateLongitude(longitude);
        this.longitude = longitude;
        return this;
    }

    public MeteoEventBuilder setStartingTime(Date startingTime) {
        validateTime(startingTime);
        this.startingTime = startingTime;
        return this;
    }

    public MeteoEventBuilder setEndingTime(Date endingTime) {
        validateTime(endingTime);
        this.endingTime = endingTime;
        return this;
    }

    public MeteoEventBuilder setSeverity(String severity) {
        validateSeverity(severity);
        this.severity = severity;
        return this;
    }

    public MeteoEventBuilder setDescription(String description) {
        validateString(description);
        this.description = description;
        return this;
    }

    public MeteoEventBuilder setHints(String hints) {
        validateString(hints);
        this.hints = hints;
        return this;
    }

    public MeteoEventBuilder setRadius(Double radius) {
        validateNonNegativeValue(radius);
        this.radius = radius;
        return this;
    }

    public MeteoEventBuilder setTemperature(Integer temperature) {
        this.temperature = temperature;
        return this;
    }

    public MeteoEventBuilder setHumidity(Integer humidity) {
        validateNonNegativeValue(humidity);
        this.humidity = humidity;
        return this;
    }

    public MeteoEventBuilder setPrecipitationLevel(Integer precipitationLevel) {
        validateNonNegativeValue(precipitationLevel);
        this.precipitationLevel = precipitationLevel;
        return this;
    }


    public MeteoEvent getMeteoEvent() {
        MeteoEvent meteoEvent=new MeteoEvent();
        meteoEvent.setLatitude(latitude);
        meteoEvent.setLongitude(longitude);
        meteoEvent.setDescription(description);
        meteoEvent.setEndingTime(endingTime);
        meteoEvent.setHints(hints);
        meteoEvent.setName(name);
        meteoEvent.setRadius(radius);
        meteoEvent.setSeverity(severity);
        meteoEvent.setStartingTime(startingTime);
        meteoEvent.setHumidity(humidity);
        meteoEvent.setPrecipitationLevel(precipitationLevel);
        meteoEvent.setTemperature(temperature);
        return meteoEvent;
    }

    //Dragos -> validate integer values
    protected void validateNonNegativeValue(Integer value) {
        if (value < 0) {
            throw new IllegalArgumentException(Integer.toString(value));
        }
    }
}
