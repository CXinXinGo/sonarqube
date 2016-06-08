/*
 * SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.sonarqube.ws.client.permission;

import javax.annotation.CheckForNull;

import static java.util.Objects.requireNonNull;

public class AddProjectCreatorToTemplateWsRequest {
  private final String templateId;
  private final String templateName;
  private final String permission;

  public AddProjectCreatorToTemplateWsRequest(Builder builder) {
    this.templateId = builder.templateId;
    this.templateName = builder.templateName;
    this.permission = requireNonNull(builder.permission);
  }

  @CheckForNull
  public String getTemplateId() {
    return templateId;
  }

  @CheckForNull
  public String getTemplateName() {
    return templateName;
  }

  public String getPermission() {
    return permission;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String templateId;
    private String templateName;
    private String permission;

    private Builder() {
      // enforce method constructor
    }

    public Builder setTemplateId(String templateId) {
      this.templateId = templateId;
      return this;
    }

    public Builder setTemplateName(String templateName) {
      this.templateName = templateName;
      return this;
    }

    public Builder setPermission(String permission) {
      this.permission = permission;
      return this;
    }

    public AddProjectCreatorToTemplateWsRequest build() {
      return new AddProjectCreatorToTemplateWsRequest(this);
    }
  }
}
