// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import androidx.appcompat.widget.s0;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/model/AutoMuteStatusRemoteDataModel;", "", "violationLevel", "", "levelChanged", "", "(IZ)V", "getLevelChanged", "()Z", "getViolationLevel", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AutoMuteStatusRemoteDataModel
{
    private final boolean levelChanged;
    private final int violationLevel;
    
    public AutoMuteStatusRemoteDataModel(@n(name = "level") final int violationLevel, @n(name = "level_changed") final boolean levelChanged) {
        this.violationLevel = violationLevel;
        this.levelChanged = levelChanged;
    }
    
    public final int component1() {
        return this.violationLevel;
    }
    
    public final boolean component2() {
        return this.levelChanged;
    }
    
    public final AutoMuteStatusRemoteDataModel copy(@n(name = "level") final int n, @n(name = "level_changed") final boolean b) {
        return new AutoMuteStatusRemoteDataModel(n, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoMuteStatusRemoteDataModel)) {
            return false;
        }
        final AutoMuteStatusRemoteDataModel autoMuteStatusRemoteDataModel = (AutoMuteStatusRemoteDataModel)o;
        return this.violationLevel == autoMuteStatusRemoteDataModel.violationLevel && this.levelChanged == autoMuteStatusRemoteDataModel.levelChanged;
    }
    
    public final boolean getLevelChanged() {
        return this.levelChanged;
    }
    
    public final int getViolationLevel() {
        return this.violationLevel;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = Integer.hashCode(this.violationLevel);
        int levelChanged;
        if ((levelChanged = (this.levelChanged ? 1 : 0)) != 0) {
            levelChanged = 1;
        }
        return hashCode * 31 + levelChanged;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AutoMuteStatusRemoteDataModel(violationLevel=");
        k.append(this.violationLevel);
        k.append(", levelChanged=");
        return s0.o(k, this.levelChanged, ')');
    }
}
