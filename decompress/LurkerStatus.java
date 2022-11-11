// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/LurkerStatus;", "", "isLurker", "", "isNewUser", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class LurkerStatus
{
    private final boolean isLurker;
    private final boolean isNewUser;
    
    public LurkerStatus(final boolean isLurker, final boolean isNewUser) {
        this.isLurker = isLurker;
        this.isNewUser = isNewUser;
    }
    
    public final boolean component1() {
        return this.isLurker;
    }
    
    public final boolean component2() {
        return this.isNewUser;
    }
    
    public final LurkerStatus copy(final boolean b, final boolean b2) {
        return new LurkerStatus(b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LurkerStatus)) {
            return false;
        }
        final LurkerStatus lurkerStatus = (LurkerStatus)o;
        return this.isLurker == lurkerStatus.isLurker && this.isNewUser == lurkerStatus.isNewUser;
    }
    
    @Override
    public int hashCode() {
        final int isLurker = this.isLurker ? 1 : 0;
        int n = 1;
        int n2 = isLurker;
        if (isLurker != 0) {
            n2 = 1;
        }
        final int isNewUser = this.isNewUser ? 1 : 0;
        if (isNewUser == 0) {
            n = isNewUser;
        }
        return n2 * 31 + n;
    }
    
    public final boolean isLurker() {
        return this.isLurker;
    }
    
    public final boolean isNewUser() {
        return this.isNewUser;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("LurkerStatus(isLurker=");
        k.append(this.isLurker);
        k.append(", isNewUser=");
        return s0.o(k, this.isNewUser, ')');
    }
}
