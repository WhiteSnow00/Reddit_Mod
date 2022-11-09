// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/model/AutoMuteStatusWrapperRemoteDataModel;", "", "autoMuteStatus", "Lcom/reddit/data/model/AutoMuteStatusRemoteDataModel;", "(Lcom/reddit/data/model/AutoMuteStatusRemoteDataModel;)V", "getAutoMuteStatus", "()Lcom/reddit/data/model/AutoMuteStatusRemoteDataModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AutoMuteStatusWrapperRemoteDataModel
{
    private final AutoMuteStatusRemoteDataModel autoMuteStatus;
    
    public AutoMuteStatusWrapperRemoteDataModel(@n(name = "auto_mute_status") final AutoMuteStatusRemoteDataModel autoMuteStatus) {
        f.f((Object)autoMuteStatus, "autoMuteStatus");
        this.autoMuteStatus = autoMuteStatus;
    }
    
    public final AutoMuteStatusRemoteDataModel component1() {
        return this.autoMuteStatus;
    }
    
    public final AutoMuteStatusWrapperRemoteDataModel copy(@n(name = "auto_mute_status") final AutoMuteStatusRemoteDataModel autoMuteStatusRemoteDataModel) {
        f.f((Object)autoMuteStatusRemoteDataModel, "autoMuteStatus");
        return new AutoMuteStatusWrapperRemoteDataModel(autoMuteStatusRemoteDataModel);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof AutoMuteStatusWrapperRemoteDataModel && f.a((Object)this.autoMuteStatus, (Object)((AutoMuteStatusWrapperRemoteDataModel)o).autoMuteStatus));
    }
    
    public final AutoMuteStatusRemoteDataModel getAutoMuteStatus() {
        return this.autoMuteStatus;
    }
    
    @Override
    public int hashCode() {
        return this.autoMuteStatus.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AutoMuteStatusWrapperRemoteDataModel(autoMuteStatus=");
        k.append(this.autoMuteStatus);
        k.append(')');
        return k.toString();
    }
}
