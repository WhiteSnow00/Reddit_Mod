// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.appconfiguration;

import com.squareup.moshi.x;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016" }, d2 = { "Lcom/reddit/data/model/appconfiguration/GoldConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/appconfiguration/GoldConfig;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "app-config_release" }, k = 1, mv = { 1, 7, 1 })
public final class GoldConfigJsonAdapter extends JsonAdapter<GoldConfig>
{
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public GoldConfigJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "premium_settings_web_url", "premium_settings_playstore_url", "coin_help_page_url", "awards_help_page_url" });
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "premiumSettingsWebUrl");
    }
    
    public GoldConfig fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s2 = null;
        String s4;
        String s3 = s4 = s2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        }
                        else {
                            s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new GoldConfig(s, s2, s3, s4);
    }
    
    public void toJson(final x x, final GoldConfig goldConfig) {
        f.f((Object)x, "writer");
        if (goldConfig != null) {
            x.h();
            x.w("premium_settings_web_url");
            this.nullableStringAdapter.toJson(x, (Object)goldConfig.getPremiumSettingsWebUrl());
            x.w("premium_settings_playstore_url");
            this.nullableStringAdapter.toJson(x, (Object)goldConfig.getPremiumSettingsPlaystoreUrl());
            x.w("coin_help_page_url");
            this.nullableStringAdapter.toJson(x, (Object)goldConfig.getCoinHelpPageUrl());
            x.w("awards_help_page_url");
            this.nullableStringAdapter.toJson(x, (Object)goldConfig.getAwardsHelpPageUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(GoldConfig)";
    }
}
