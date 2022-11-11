// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/reddit/vault/model/CommunityResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/CommunityResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/vault/model/PointsImages;", "pointsImagesAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/reddit/vault/model/VaultProvider;", "nullableVaultProviderAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityResponseJsonAdapter extends JsonAdapter<CommunityResponse>
{
    public static final int $stable = 8;
    private final JsonAdapter<VaultProvider> nullableVaultProviderAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<PointsImages> pointsImagesAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public CommunityResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "pointsImages", "pointsName", "walletProvider" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.pointsImagesAdapter = (JsonAdapter<PointsImages>)y.c((Type)PointsImages.class, (Set)instance, "pointsImages");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "pointsName");
        this.nullableVaultProviderAdapter = (JsonAdapter<VaultProvider>)y.c((Type)VaultProvider.class, (Set)instance, "vaultProvider");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        PointsImages pointsImages = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        o2 = this.nullableVaultProviderAdapter.fromJson(jsonReader);
                    }
                    else {
                        o = this.stringAdapter.fromJson(jsonReader);
                        if (o != null) {
                            continue;
                        }
                        throw a.n("pointsName", "pointsName", jsonReader);
                    }
                }
                else {
                    pointsImages = (PointsImages)this.pointsImagesAdapter.fromJson(jsonReader);
                    if (pointsImages != null) {
                        continue;
                    }
                    throw a.n("pointsImages", "pointsImages", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (pointsImages == null) {
            throw a.h("pointsImages", "pointsImages", jsonReader);
        }
        if (o != null) {
            return new CommunityResponse(pointsImages, (String)o, (VaultProvider)o2);
        }
        throw a.h("pointsName", "pointsName", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CommunityResponse communityResponse = (CommunityResponse)o;
        e.f((Object)x, "writer");
        if (communityResponse != null) {
            x.h();
            x.u("pointsImages");
            this.pointsImagesAdapter.toJson(x, (Object)communityResponse.a);
            x.u("pointsName");
            this.stringAdapter.toJson(x, (Object)communityResponse.b);
            x.u("walletProvider");
            this.nullableVaultProviderAdapter.toJson(x, (Object)communityResponse.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CommunityResponse)";
    }
}
