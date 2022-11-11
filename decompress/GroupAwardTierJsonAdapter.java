// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/awards/model/GroupAwardTierJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/awards/model/GroupAwardTier;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/image/model/ImageResolution;", "listOfImageResolutionAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class GroupAwardTierJsonAdapter extends JsonAdapter<GroupAwardTier>
{
    private volatile Constructor<GroupAwardTier> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ImageResolution>> listOfImageResolutionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public GroupAwardTierJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "awardings_required", "resized_icons", "resized_static_icons", "icon_format" });
        final Class<Integer> type = Integer.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)type, (Set)instance, "awardingsRequired");
        this.listOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)a0.d((Class)List.class, new Type[] { ImageResolution.class }), (Set)instance, "resizedIcons");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "iconFormatRaw");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Integer n2 = null;
        List<ImageResolution> list = null;
        Object o = null;
        Object o2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFF7;
                        }
                        else {
                            o = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                            if (o == null) {
                                throw a.n("resizedStaticIcons", "resized_static_icons", jsonReader);
                            }
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        list = (List)this.listOfImageResolutionAdapter.fromJson(jsonReader);
                        if (list != null) {
                            continue;
                        }
                        throw a.n("resizedIcons", "resized_icons", jsonReader);
                    }
                }
                else {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("awardingsRequired", "awardings_required", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        GroupAwardTier groupAwardTier;
        if (n == -13) {
            if (n2 == null) {
                throw a.h("awardingsRequired", "awardings_required", jsonReader);
            }
            final int intValue = n2;
            if (list == null) {
                throw a.h("resizedIcons", "resized_icons", jsonReader);
            }
            f.d(o, "null cannot be cast to non-null type kotlin.collections.List<com.reddit.domain.image.model.ImageResolution>");
            groupAwardTier = new GroupAwardTier(intValue, list, (List<ImageResolution>)o, (String)o2);
        }
        else {
            Constructor<GroupAwardTier> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Integer> type = Integer.TYPE;
                constructorRef = GroupAwardTier.class.getDeclaredConstructor(type, List.class, List.class, String.class, type, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "GroupAwardTier::class.ja\u2026his.constructorRef = it }");
            }
            if (n2 == null) {
                throw a.h("awardingsRequired", "awardings_required", jsonReader);
            }
            final int intValue2 = n2;
            if (list == null) {
                throw a.h("resizedIcons", "resized_icons", jsonReader);
            }
            final GroupAwardTier instance = constructorRef.newInstance(intValue2, list, o, o2, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            groupAwardTier = instance;
        }
        return groupAwardTier;
    }
    
    public final void toJson(final x x, final Object o) {
        final GroupAwardTier groupAwardTier = (GroupAwardTier)o;
        f.f((Object)x, "writer");
        if (groupAwardTier != null) {
            x.h();
            x.w("awardings_required");
            c.n(groupAwardTier.f, this.intAdapter, x, "resized_icons");
            this.listOfImageResolutionAdapter.toJson(x, (Object)groupAwardTier.g);
            x.w("resized_static_icons");
            this.listOfImageResolutionAdapter.toJson(x, (Object)groupAwardTier.h);
            x.w("icon_format");
            this.nullableStringAdapter.toJson(x, (Object)groupAwardTier.i);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(GroupAwardTier)";
    }
}
