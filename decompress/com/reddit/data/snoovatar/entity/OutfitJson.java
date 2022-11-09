// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import a2.b;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u00e5\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001¨\u0006\u001a" }, d2 = { "Lcom/reddit/data/snoovatar/entity/OutfitJson;", "", "", "id", "sectionId", "", "accessoryIds", "state", "capabilityRequired", "customizableClasses", "tags", "", "availableForCloset", "title", "subtitle", "backgroundImageUrl", "foregroundImageUrl", "preRenderImage", "nftTokenId", "nftContractAddress", "nftRarity", "nftWalletAddress", "inventoryItemId", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class OutfitJson
{
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    
    public OutfitJson(final String a, @n(name = "section_id") final String b, @n(name = "accessory_ids") final List<String> c, final String d, @n(name = "capability_required") final String e, @n(name = "customizable_classes") final List<String> f, final List<String> g, @n(name = "available_for_closet") final boolean h, @n(name = "title") final String i, @n(name = "subtitle") final String j, @n(name = "background_image_url") final String k, @n(name = "foreground_image_url") final String l, @n(name = "pre_render_image") final String m, @n(name = "nft_token_id") final String n, @n(name = "nft_contract_address") final String o, @n(name = "nft_rarity") final String p18, @n(name = "nft_wallet_address") final String q, @n(name = "inventory_item_id") final String r) {
        ah2.f.f((Object)a, "id");
        ah2.f.f((Object)b, "sectionId");
        ah2.f.f((Object)c, "accessoryIds");
        ah2.f.f((Object)d, "state");
        ah2.f.f((Object)f, "customizableClasses");
        ah2.f.f((Object)g, "tags");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    public final OutfitJson copy(final String s, @n(name = "section_id") final String s2, @n(name = "accessory_ids") final List<String> list, final String s3, @n(name = "capability_required") final String s4, @n(name = "customizable_classes") final List<String> list2, final List<String> list3, @n(name = "available_for_closet") final boolean b, @n(name = "title") final String s5, @n(name = "subtitle") final String s6, @n(name = "background_image_url") final String s7, @n(name = "foreground_image_url") final String s8, @n(name = "pre_render_image") final String s9, @n(name = "nft_token_id") final String s10, @n(name = "nft_contract_address") final String s11, @n(name = "nft_rarity") final String s12, @n(name = "nft_wallet_address") final String s13, @n(name = "inventory_item_id") final String s14) {
        ah2.f.f((Object)s, "id");
        ah2.f.f((Object)s2, "sectionId");
        ah2.f.f((Object)list, "accessoryIds");
        ah2.f.f((Object)s3, "state");
        ah2.f.f((Object)list2, "customizableClasses");
        ah2.f.f((Object)list3, "tags");
        return new OutfitJson(s, s2, list, s3, s4, list2, list3, b, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutfitJson)) {
            return false;
        }
        final OutfitJson outfitJson = (OutfitJson)o;
        return ah2.f.a((Object)this.a, (Object)outfitJson.a) && ah2.f.a((Object)this.b, (Object)outfitJson.b) && ah2.f.a((Object)this.c, (Object)outfitJson.c) && ah2.f.a((Object)this.d, (Object)outfitJson.d) && ah2.f.a((Object)this.e, (Object)outfitJson.e) && ah2.f.a((Object)this.f, (Object)outfitJson.f) && ah2.f.a((Object)this.g, (Object)outfitJson.g) && this.h == outfitJson.h && ah2.f.a((Object)this.i, (Object)outfitJson.i) && ah2.f.a((Object)this.j, (Object)outfitJson.j) && ah2.f.a((Object)this.k, (Object)outfitJson.k) && ah2.f.a((Object)this.l, (Object)outfitJson.l) && ah2.f.a((Object)this.m, (Object)outfitJson.m) && ah2.f.a((Object)this.n, (Object)outfitJson.n) && ah2.f.a((Object)this.o, (Object)outfitJson.o) && ah2.f.a((Object)this.p, (Object)outfitJson.p) && ah2.f.a((Object)this.q, (Object)outfitJson.q) && ah2.f.a((Object)this.r, (Object)outfitJson.r);
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.d, a2.b.a((List)this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final int a = a2.b.a((List)this.g, a2.b.a((List)this.f, (f + hashCode2) * 31, 31), 31);
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final String j = this.j;
        int hashCode4;
        if (j == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = j.hashCode();
        }
        final String k = this.k;
        int hashCode5;
        if (k == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = k.hashCode();
        }
        final String l = this.l;
        int hashCode6;
        if (l == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = l.hashCode();
        }
        final String m = this.m;
        int hashCode7;
        if (m == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = m.hashCode();
        }
        final String n = this.n;
        int hashCode8;
        if (n == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = n.hashCode();
        }
        final String o = this.o;
        int hashCode9;
        if (o == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = o.hashCode();
        }
        final String p = this.p;
        int hashCode10;
        if (p == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = p.hashCode();
        }
        final String q = this.q;
        int hashCode11;
        if (q == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = q.hashCode();
        }
        final String r = this.r;
        if (r != null) {
            hashCode = r.hashCode();
        }
        return ((((((((((a + h) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("OutfitJson(id=");
        k.append(this.a);
        k.append(", sectionId=");
        k.append(this.b);
        k.append(", accessoryIds=");
        k.append(this.c);
        k.append(", state=");
        k.append(this.d);
        k.append(", capabilityRequired=");
        k.append(this.e);
        k.append(", customizableClasses=");
        k.append(this.f);
        k.append(", tags=");
        k.append(this.g);
        k.append(", availableForCloset=");
        k.append(this.h);
        k.append(", title=");
        k.append(this.i);
        k.append(", subtitle=");
        k.append(this.j);
        k.append(", backgroundImageUrl=");
        k.append(this.k);
        k.append(", foregroundImageUrl=");
        k.append(this.l);
        k.append(", preRenderImage=");
        k.append(this.m);
        k.append(", nftTokenId=");
        k.append(this.n);
        k.append(", nftContractAddress=");
        k.append(this.o);
        k.append(", nftRarity=");
        k.append(this.p);
        k.append(", nftWalletAddress=");
        k.append(this.q);
        k.append(", inventoryItemId=");
        return b.k(k, this.r, ')');
    }
}
