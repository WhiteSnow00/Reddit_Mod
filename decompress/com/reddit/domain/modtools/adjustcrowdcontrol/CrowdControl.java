// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.adjustcrowdcontrol;

import sg2.e;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/modtools/adjustcrowdcontrol/CrowdControl;", "", "isCrowdControlFilterEnabled", "", "crowdControlLevel", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "(ZLcom/reddit/domain/model/mod/CrowdControlFilterLevel;)V", "getCrowdControlLevel", "()Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CrowdControl
{
    private final CrowdControlFilterLevel crowdControlLevel;
    private final boolean isCrowdControlFilterEnabled;
    
    public CrowdControl(final boolean isCrowdControlFilterEnabled, final CrowdControlFilterLevel crowdControlLevel) {
        e.f((Object)crowdControlLevel, "crowdControlLevel");
        this.isCrowdControlFilterEnabled = isCrowdControlFilterEnabled;
        this.crowdControlLevel = crowdControlLevel;
    }
    
    public final boolean component1() {
        return this.isCrowdControlFilterEnabled;
    }
    
    public final CrowdControlFilterLevel component2() {
        return this.crowdControlLevel;
    }
    
    public final CrowdControl copy(final boolean b, final CrowdControlFilterLevel crowdControlFilterLevel) {
        e.f((Object)crowdControlFilterLevel, "crowdControlLevel");
        return new CrowdControl(b, crowdControlFilterLevel);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrowdControl)) {
            return false;
        }
        final CrowdControl crowdControl = (CrowdControl)o;
        return this.isCrowdControlFilterEnabled == crowdControl.isCrowdControlFilterEnabled && this.crowdControlLevel == crowdControl.crowdControlLevel;
    }
    
    public final CrowdControlFilterLevel getCrowdControlLevel() {
        return this.crowdControlLevel;
    }
    
    @Override
    public int hashCode() {
        int isCrowdControlFilterEnabled;
        if ((isCrowdControlFilterEnabled = (this.isCrowdControlFilterEnabled ? 1 : 0)) != 0) {
            isCrowdControlFilterEnabled = 1;
        }
        return this.crowdControlLevel.hashCode() + isCrowdControlFilterEnabled * 31;
    }
    
    public final boolean isCrowdControlFilterEnabled() {
        return this.isCrowdControlFilterEnabled;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("CrowdControl(isCrowdControlFilterEnabled=");
        r.append(this.isCrowdControlFilterEnabled);
        r.append(", crowdControlLevel=");
        r.append(this.crowdControlLevel);
        r.append(')');
        return r.toString();
    }
}
