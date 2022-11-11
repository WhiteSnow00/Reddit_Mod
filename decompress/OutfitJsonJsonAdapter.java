// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

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
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u0012" }, d2 = { "Lcom/reddit/data/snoovatar/entity/OutfitJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/OutfitJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class OutfitJsonJsonAdapter extends JsonAdapter<OutfitJson>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public OutfitJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "section_id", "accessory_ids", "state", "capability_required", "customizable_classes", "tags", "available_for_closet", "title", "subtitle", "background_image_url", "foreground_image_url", "pre_render_image", "nft_token_id", "nft_contract_address", "nft_rarity", "nft_wallet_address", "inventory_item_id" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "accessoryIds");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "capabilityRequired");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "availableForCloset");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        Object o7;
        Object o6 = o7 = o5;
        Object o9;
        Object o8 = o9 = o7;
        Object o10;
        String s = (String)(o10 = o9);
        Object o11;
        String s2 = (String)(o11 = o10);
        Object o12;
        String s3 = (String)(o12 = o11);
        Object o13;
        String s4 = (String)(o13 = o12);
        while (jsonReader.hasNext()) {
            String s5 = null;
            String s6 = null;
            String s7 = null;
            List<String> list = null;
            Boolean b3 = null;
            String s12 = null;
            List list4 = null;
            String s15 = null;
            Label_0784: {
                String s10 = null;
                Label_0780: {
                    Label_0776: {
                        Label_0772: {
                            Label_0769: {
                                String s9 = null;
                                Label_0761: {
                                    Label_0757: {
                                        Label_0753: {
                                            Label_0749: {
                                                switch (jsonReader.F(this.options)) {
                                                    case 17: {
                                                        o13 = this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 16: {
                                                        s4 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 15: {
                                                        o12 = this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 14: {
                                                        s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 13: {
                                                        o11 = this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 12: {
                                                        s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        break;
                                                    }
                                                    case 11: {
                                                        s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        break Label_0749;
                                                    }
                                                    case 10: {
                                                        s6 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        s5 = (String)o10;
                                                        break Label_0753;
                                                    }
                                                    case 9: {
                                                        s7 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        s6 = s;
                                                        s5 = (String)o10;
                                                        break Label_0757;
                                                    }
                                                    case 8: {
                                                        final String s8 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        s5 = (String)o10;
                                                        s9 = s8;
                                                        s7 = (String)o9;
                                                        s6 = s;
                                                        break Label_0761;
                                                    }
                                                    case 7: {
                                                        final Boolean b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                                        if (b2 != null) {
                                                            s5 = (String)o10;
                                                            s6 = s;
                                                            list = (List<String>)o5;
                                                            b3 = b2;
                                                            s10 = (String)o8;
                                                            s7 = (String)o9;
                                                            break Label_0772;
                                                        }
                                                        throw a.n("availableForCloset", "available_for_closet", jsonReader);
                                                    }
                                                    case 6: {
                                                        final List list2 = (List)this.listOfStringAdapter.fromJson(jsonReader);
                                                        if (list2 != null) {
                                                            s5 = (String)o10;
                                                            s6 = s;
                                                            final String s11 = (String)o8;
                                                            list = (List<String>)o5;
                                                            b3 = b;
                                                            s12 = (String)list2;
                                                            s10 = s11;
                                                            s7 = (String)o9;
                                                            break Label_0776;
                                                        }
                                                        throw a.n("tags", "tags", jsonReader);
                                                    }
                                                    case 5: {
                                                        final List list3 = (List)this.listOfStringAdapter.fromJson(jsonReader);
                                                        if (list3 != null) {
                                                            s5 = (String)o10;
                                                            s6 = s;
                                                            s7 = (String)o9;
                                                            final String s13 = (String)o8;
                                                            list = (List<String>)o5;
                                                            b3 = b;
                                                            s12 = (String)o7;
                                                            list4 = list3;
                                                            s10 = s13;
                                                            break Label_0780;
                                                        }
                                                        throw a.n("customizableClasses", "customizable_classes", jsonReader);
                                                    }
                                                    case 4: {
                                                        final String s14 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                                                        s6 = s;
                                                        list = (List<String>)s14;
                                                        s10 = (String)o8;
                                                        s7 = (String)o9;
                                                        s5 = (String)o10;
                                                        break Label_0769;
                                                    }
                                                    case 3: {
                                                        o4 = this.stringAdapter.fromJson(jsonReader);
                                                        if (o4 != null) {
                                                            s5 = (String)o10;
                                                            s6 = s;
                                                            s7 = (String)o9;
                                                            s15 = (String)o8;
                                                            list = (List<String>)o5;
                                                            b3 = b;
                                                            s12 = (String)o7;
                                                            list4 = (List)o6;
                                                            break Label_0784;
                                                        }
                                                        throw a.n("state", "state", jsonReader);
                                                    }
                                                    case 2: {
                                                        o3 = this.listOfStringAdapter.fromJson(jsonReader);
                                                        if (o3 != null) {
                                                            continue;
                                                        }
                                                        throw a.n("accessoryIds", "accessory_ids", jsonReader);
                                                    }
                                                    case 1: {
                                                        o2 = this.stringAdapter.fromJson(jsonReader);
                                                        if (o2 != null) {
                                                            break;
                                                        }
                                                        throw a.n("sectionId", "section_id", jsonReader);
                                                    }
                                                    case 0: {
                                                        o = this.stringAdapter.fromJson(jsonReader);
                                                        if (o != null) {
                                                            break;
                                                        }
                                                        throw a.n("id", "id", jsonReader);
                                                    }
                                                    case -1: {
                                                        jsonReader.J();
                                                        jsonReader.z1();
                                                        break;
                                                    }
                                                }
                                                s5 = (String)o10;
                                            }
                                            s6 = s;
                                        }
                                        s7 = (String)o9;
                                    }
                                    s9 = (String)o8;
                                }
                                list = (List<String>)o5;
                                s10 = s9;
                            }
                            b3 = b;
                        }
                        s12 = (String)o7;
                    }
                    list4 = (List)o6;
                }
                s15 = s10;
            }
            b = b3;
            o5 = list;
            o6 = list4;
            o7 = s12;
            o8 = s15;
            o9 = s7;
            s = s6;
            o10 = s5;
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o2 == null) {
            throw a.h("sectionId", "section_id", jsonReader);
        }
        if (o3 == null) {
            throw a.h("accessoryIds", "accessory_ids", jsonReader);
        }
        if (o4 == null) {
            throw a.h("state", "state", jsonReader);
        }
        if (o6 == null) {
            throw a.h("customizableClasses", "customizable_classes", jsonReader);
        }
        if (o7 == null) {
            throw a.h("tags", "tags", jsonReader);
        }
        if (b != null) {
            return new OutfitJson((String)o, (String)o2, (List<String>)o3, (String)o4, (String)o5, (List<String>)o6, (List<String>)o7, b, (String)o8, (String)o9, s, (String)o10, s2, (String)o11, s3, (String)o12, s4, (String)o13);
        }
        throw a.h("availableForCloset", "available_for_closet", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final OutfitJson outfitJson = (OutfitJson)o;
        f.f((Object)x, "writer");
        if (outfitJson != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)outfitJson.a);
            x.w("section_id");
            this.stringAdapter.toJson(x, (Object)outfitJson.b);
            x.w("accessory_ids");
            this.listOfStringAdapter.toJson(x, (Object)outfitJson.c);
            x.w("state");
            this.stringAdapter.toJson(x, (Object)outfitJson.d);
            x.w("capability_required");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.e);
            x.w("customizable_classes");
            this.listOfStringAdapter.toJson(x, (Object)outfitJson.f);
            x.w("tags");
            this.listOfStringAdapter.toJson(x, (Object)outfitJson.g);
            x.w("available_for_closet");
            a.v(outfitJson.h, (JsonAdapter)this.booleanAdapter, x, "title");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.i);
            x.w("subtitle");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.j);
            x.w("background_image_url");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.k);
            x.w("foreground_image_url");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.l);
            x.w("pre_render_image");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.m);
            x.w("nft_token_id");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.n);
            x.w("nft_contract_address");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.o);
            x.w("nft_rarity");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.p);
            x.w("nft_wallet_address");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.q);
            x.w("inventory_item_id");
            this.nullableStringAdapter.toJson(x, (Object)outfitJson.r);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(OutfitJson)";
    }
}
