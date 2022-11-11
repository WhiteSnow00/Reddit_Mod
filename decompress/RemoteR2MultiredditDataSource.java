// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.p;
import av2.b;
import nf2.a;
import av2.s;
import org.json.JSONObject;
import com.reddit.data.adapter.Enveloped;
import av2.o;
import av2.e;
import com.reddit.data.model.MultiredditR2DataModel;
import nf2.c0;
import java.util.List;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J9\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'JC\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006H'\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH'\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f" }, d2 = { "Lcom/reddit/data/remote/RemoteR2MultiredditDataSource;", "", "Lcom/reddit/domain/model/MultiredditPath;", "path", "Lorg/json/JSONObject;", "model", "", "includeSubreddits", "Lnf2/c0;", "Lcom/reddit/data/model/MultiredditR2DataModel;", "updateInner-AEi484M", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Lnf2/c0;", "updateInner", "createInner", "", "displayName", "description", "from", "copy-LuTlwXg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnf2/c0;", "copy", "Lnf2/a;", "delete-OkfJBF8", "(Ljava/lang/String;)Lnf2/a;", "delete", "updateFollowedInner", "", "subredditName", "addSubreddits-OhVY_gU", "(Ljava/lang/String;Ljava/util/List;)Lnf2/c0;", "addSubreddits", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteR2MultiredditDataSource
{
    @e
    @o("api/multi/add_srs_bulk")
    @Enveloped
    c0<MultiredditR2DataModel> addSubreddits-OhVY_gU(@c(encoded = true, value = "path") final String p0, @c("sr_names") final List<String> p1);
    
    @e
    @o("api/multi/copy")
    @Enveloped
    c0<MultiredditR2DataModel> copy-LuTlwXg(@c("display_name") final String p0, @c("description_md") final String p1, @c("from") final String p2, @c("expand_srs") final boolean p3);
    
    @e
    @o("api/multi")
    @Enveloped
    c0<MultiredditR2DataModel> createInner(@c("model") final JSONObject p0);
    
    @b("api/multi{path}")
    a delete-OkfJBF8(@s(encoded = true, value = "path") final String p0);
    
    @e
    @o("api/multi/subscribe")
    a updateFollowedInner(@c("model") final JSONObject p0);
    
    @e
    @p("api/multi{path}")
    @Enveloped
    c0<MultiredditR2DataModel> updateInner-AEi484M(@s(encoded = true, value = "path") final String p0, @c("model") final JSONObject p1, @c("expand_srs") final boolean p2);
}
