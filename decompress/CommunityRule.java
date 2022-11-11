// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import java.io.Serializable;

public class CommunityRule implements Serializable, Thing
{
    private final long created_utc;
    private final String description;
    private final String description_html;
    private String id;
    private final String kind;
    private final int priority;
    private final String short_name;
    private final String violation_reason;
    
    public CommunityRule(final String kind, final String description, final String violation_reason, final long created_utc, final int priority, final String short_name, final String description_html) {
        this.kind = kind;
        this.description = description;
        this.violation_reason = violation_reason;
        this.created_utc = created_utc;
        this.priority = priority;
        this.short_name = short_name;
        this.description_html = description_html;
    }
    
    @Override
    public long getCreatedUtc() {
        return this.created_utc;
    }
    
    public long getCreated_utc() {
        return this.created_utc;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getDescription_html() {
        return this.description_html;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    @Override
    public String getName() {
        return this.short_name;
    }
    
    public int getPriority() {
        return this.priority;
    }
    
    public String getShort_name() {
        return this.short_name;
    }
    
    public String getViolation_reason() {
        return this.violation_reason;
    }
}
