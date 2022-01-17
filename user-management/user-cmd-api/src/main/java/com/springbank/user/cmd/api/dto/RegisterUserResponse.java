package com.springbank.user.cmd.api.dto;

import java.util.Objects;

public class RegisterUserResponse extends BaseResponse {

    private String id;

    public RegisterUserResponse(String id, String message) {
        super(message);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RegisterUserResponse that = (RegisterUserResponse) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
