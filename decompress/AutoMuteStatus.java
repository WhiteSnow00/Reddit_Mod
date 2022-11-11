// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/streaming/AutoMuteStatus;", "", "violationLevel", "Lcom/reddit/domain/model/streaming/AutoMuteViolationLevel;", "levelChanged", "", "(Lcom/reddit/domain/model/streaming/AutoMuteViolationLevel;Z)V", "getLevelChanged", "()Z", "getViolationLevel", "()Lcom/reddit/domain/model/streaming/AutoMuteViolationLevel;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AutoMuteStatus
{
    private final boolean levelChanged;
    private final AutoMuteViolationLevel violationLevel;
    
    public AutoMuteStatus(final AutoMuteViolationLevel violationLevel, final boolean levelChanged) {
        f.f((Object)violationLevel, "violationLevel");
        this.violationLevel = violationLevel;
        this.levelChanged = levelChanged;
    }
    
    public final AutoMuteViolationLevel component1() {
        return this.violationLevel;
    }
    
    public final boolean component2() {
        return this.levelChanged;
    }
    
    public final AutoMuteStatus copy(final AutoMuteViolationLevel autoMuteViolationLevel, final boolean b) {
        f.f((Object)autoMuteViolationLevel, "violationLevel");
        return new AutoMuteStatus(autoMuteViolationLevel, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoMuteStatus)) {
            return false;
        }
        final AutoMuteStatus autoMuteStatus = (AutoMuteStatus)o;
        return this.violationLevel == autoMuteStatus.violationLevel && this.levelChanged == autoMuteStatus.levelChanged;
    }
    
    public final boolean getLevelChanged() {
        return this.levelChanged;
    }
    
    public final AutoMuteViolationLevel getViolationLevel() {
        return this.violationLevel;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.violationLevel.hashCode();
        int levelChanged;
        if ((levelChanged = (this.levelChanged ? 1 : 0)) != 0) {
            levelChanged = 1;
        }
        return hashCode * 31 + levelChanged;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AutoMuteStatus(violationLevel=");
        k.append(this.violationLevel);
        k.append(", levelChanged=");
        return s0.o(k, this.levelChanged, ')');
    }
}
