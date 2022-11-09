// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.f;
import com.reddit.data.model.RemoteRegionDataModel;
import java.util.Map;
import nf2.c0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H'¨\u0006\u0007" }, d2 = { "Lcom/reddit/data/remote/RemoteRegionDataSource;", "", "Lnf2/c0;", "", "", "Lcom/reddit/data/model/RemoteRegionDataModel;", "getRegions", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteRegionDataSource
{
    @f("api/geopopular_config")
    c0<Map<String, RemoteRegionDataModel>> getRegions();
}
