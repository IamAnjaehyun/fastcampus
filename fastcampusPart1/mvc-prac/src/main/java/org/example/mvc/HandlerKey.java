package org.example.mvc;

import org.example.mvc.controller.RequestMethod;

import java.util.Objects;

public class HandlerKey {
    private final RequestMethod requestMEthod;
    private final String uriPath;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandlerKey that = (HandlerKey) o;
        return requestMEthod == that.requestMEthod && Objects.equals(uriPath, that.uriPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMEthod, uriPath);
    }

    public HandlerKey(RequestMethod requestMethod, String uriPath) {
        this.requestMEthod = requestMethod;
        this.uriPath = uriPath;

    }
}
