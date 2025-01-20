package com.challenge.forohub.persistence.entity;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum Role {
  ADMIN(Arrays.asList(Permissions.values())),
  USER(Arrays.asList(Permissions.values()));

  private final List<Permissions> permissions;

  Role(List<Permissions> permissions) {
    this.permissions = permissions;
  }
}
