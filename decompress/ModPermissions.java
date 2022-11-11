// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/model/ModPermissions;", "", "isAccessEnabled", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/reddit/data/model/ModPermissions;", "equals", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ModPermissions
{
    private final Boolean isAccessEnabled;
    
    public ModPermissions(final Boolean isAccessEnabled) {
        this.isAccessEnabled = isAccessEnabled;
    }
    
    public final Boolean component1() {
        return this.isAccessEnabled;
    }
    
    public final ModPermissions copy(final Boolean b) {
        return new ModPermissions(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ModPermissions && f.a((Object)this.isAccessEnabled, (Object)((ModPermissions)o).isAccessEnabled));
    }
    
    @Override
    public int hashCode() {
        final Boolean isAccessEnabled = this.isAccessEnabled;
        int hashCode;
        if (isAccessEnabled == null) {
            hashCode = 0;
        }
        else {
            hashCode = isAccessEnabled.hashCode();
        }
        return hashCode;
    }
    
    public final Boolean isAccessEnabled() {
        return this.isAccessEnabled;
    }
    
    @Override
    public String toString() {
        return d.m(a.k("ModPermissions(isAccessEnabled="), this.isAccessEnabled, ')');
    }
}
