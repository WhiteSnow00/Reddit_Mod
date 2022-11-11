// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import hj.a;

public class EventNamespace
{
    @a("action")
    public final String action;
    @a("client")
    public final String client;
    @a("component")
    public final String component;
    @a("element")
    public final String element;
    @a("page")
    public final String page;
    @a("section")
    public final String section;
    
    public EventNamespace(final String client, final String page, final String section, final String component, final String element, final String action) {
        this.client = client;
        this.page = page;
        this.section = section;
        this.component = component;
        this.element = element;
        this.action = action;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final EventNamespace eventNamespace = (EventNamespace)o;
            final String action = this.action;
            Label_0062: {
                if (action != null) {
                    if (action.equals(eventNamespace.action)) {
                        break Label_0062;
                    }
                }
                else if (eventNamespace.action == null) {
                    break Label_0062;
                }
                return false;
            }
            final String client = this.client;
            Label_0094: {
                if (client != null) {
                    if (client.equals(eventNamespace.client)) {
                        break Label_0094;
                    }
                }
                else if (eventNamespace.client == null) {
                    break Label_0094;
                }
                return false;
            }
            final String component = this.component;
            Label_0126: {
                if (component != null) {
                    if (component.equals(eventNamespace.component)) {
                        break Label_0126;
                    }
                }
                else if (eventNamespace.component == null) {
                    break Label_0126;
                }
                return false;
            }
            final String element = this.element;
            Label_0158: {
                if (element != null) {
                    if (element.equals(eventNamespace.element)) {
                        break Label_0158;
                    }
                }
                else if (eventNamespace.element == null) {
                    break Label_0158;
                }
                return false;
            }
            final String page = this.page;
            Label_0190: {
                if (page != null) {
                    if (page.equals(eventNamespace.page)) {
                        break Label_0190;
                    }
                }
                else if (eventNamespace.page == null) {
                    break Label_0190;
                }
                return false;
            }
            final String section = this.section;
            final String section2 = eventNamespace.section;
            if (section != null) {
                if (section.equals(section2)) {
                    return true;
                }
            }
            else if (section2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String client = this.client;
        int hashCode = 0;
        int hashCode2;
        if (client != null) {
            hashCode2 = client.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String page = this.page;
        int hashCode3;
        if (page != null) {
            hashCode3 = page.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String section = this.section;
        int hashCode4;
        if (section != null) {
            hashCode4 = section.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String component = this.component;
        int hashCode5;
        if (component != null) {
            hashCode5 = component.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String element = this.element;
        int hashCode6;
        if (element != null) {
            hashCode6 = element.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final String action = this.action;
        if (action != null) {
            hashCode = action.hashCode();
        }
        return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("client=");
        r.append(this.client);
        r.append(", page=");
        r.append(this.page);
        r.append(", section=");
        r.append(this.section);
        r.append(", component=");
        r.append(this.component);
        r.append(", element=");
        r.append(this.element);
        r.append(", action=");
        r.append(this.action);
        return r.toString();
    }
    
    public static class Builder
    {
        private String action;
        private String client;
        private String component;
        private String element;
        private String page;
        private String section;
        
        public EventNamespace builder() {
            return new EventNamespace(this.client, this.page, this.section, this.component, this.element, this.action);
        }
        
        public Builder setAction(final String action) {
            this.action = action;
            return this;
        }
        
        public Builder setClient(final String client) {
            this.client = client;
            return this;
        }
        
        public Builder setComponent(final String component) {
            this.component = component;
            return this;
        }
        
        public Builder setElement(final String element) {
            this.element = element;
            return this;
        }
        
        public Builder setPage(final String page) {
            this.page = page;
            return this;
        }
        
        public Builder setSection(final String section) {
            this.section = section;
            return this;
        }
    }
}
