/*******************************************************************************
 * Copyright (c) 2013 Edward Wagner. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package restdoclet.model;

import java.util.Collection;

public class ClassDescriptor {

    private final String name;
    private final Collection<EndpointDescriptor> endpoints;
    private final String description;

    public ClassDescriptor(String name, Collection<EndpointDescriptor> endpoints, String description) {
        this.name = name;
        this.endpoints = endpoints;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Collection<EndpointDescriptor> getEndpoints() {
        return endpoints;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ClassDescriptor{" +
                "name='" + name + '\'' +
                ", endpoints=" + endpoints +
                ", description='" + description + '\'' +
                '}';
    }
}
