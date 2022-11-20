// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import ij.a;

public class MentionEntity extends Entity
{
    @a("id")
    public final long id;
    @a("id_str")
    public final String idStr;
    @a("name")
    public final String name;
    @a("screen_name")
    public final String screenName;
    
    public MentionEntity(final long id, final String idStr, final String name, final String screenName, final int n, final int n2) {
        super(n, n2);
        this.id = id;
        this.idStr = idStr;
        this.name = name;
        this.screenName = screenName;
    }
    
    public /* bridge */ int getEnd() {
        return super.getEnd();
    }
    
    public /* bridge */ int getStart() {
        return super.getStart();
    }
}
