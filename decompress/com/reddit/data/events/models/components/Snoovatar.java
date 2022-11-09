// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import kt.c;
import java.util.ArrayList;
import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Snoovatar
{
    public static final a<Snoovatar, Builder> ADAPTER;
    public final String full_image_url;
    public final String gear_bottom;
    public final String gear_bottom_acc;
    public final String gear_expression;
    public final String gear_face;
    public final String gear_face_acc;
    public final String gear_hair;
    public final String gear_hair_acc;
    public final String gear_id;
    public final List<String> gear_ids;
    public final List<String> gear_states;
    public final String gear_status;
    public final String gear_top;
    public final String gear_top_acc;
    public final Boolean has_premium_gear;
    public final String headshot_image_url;
    public final Long id;
    public final String nft_accessory_id;
    public final String nft_contract_address;
    public final String nft_item_id;
    public final String nft_name;
    public final String nft_rating;
    public final String nft_token_id;
    public final String nft_wallet_address;
    public final Long section_index;
    public final String section_name;
    public final Boolean snoovatar_active;
    public final String snoovatar_name;
    public final String sort;
    public final String sort_category;
    public final String user_generated;
    public final String user_generated_source;
    public final Boolean user_has_nft;
    
    static {
        ADAPTER = (a)new SnoovatarAdapter(null);
    }
    
    private Snoovatar(final Builder builder) {
        this.gear_id = Builder.access$100(builder);
        final List access$200 = Builder.access$200(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.gear_ids = unmodifiableList;
        this.snoovatar_active = Builder.access$300(builder);
        this.id = Builder.access$400(builder);
        this.full_image_url = Builder.access$500(builder);
        this.headshot_image_url = Builder.access$600(builder);
        this.gear_expression = Builder.access$700(builder);
        this.gear_hair = Builder.access$800(builder);
        this.gear_hair_acc = Builder.access$900(builder);
        this.gear_face = Builder.access$1000(builder);
        this.gear_face_acc = Builder.access$1100(builder);
        this.gear_top = Builder.access$1200(builder);
        this.gear_top_acc = Builder.access$1300(builder);
        this.gear_bottom = Builder.access$1400(builder);
        this.gear_bottom_acc = Builder.access$1500(builder);
        this.has_premium_gear = Builder.access$1600(builder);
        this.gear_status = Builder.access$1700(builder);
        this.user_generated = Builder.access$1800(builder);
        this.user_generated_source = Builder.access$1900(builder);
        this.user_has_nft = Builder.access$2000(builder);
        this.nft_name = Builder.access$2100(builder);
        List<String> unmodifiableList2;
        if (Builder.access$2200(builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$2200(builder));
        }
        this.gear_states = unmodifiableList2;
        this.snoovatar_name = Builder.access$2300(builder);
        this.section_name = Builder.access$2400(builder);
        this.nft_token_id = Builder.access$2500(builder);
        this.nft_wallet_address = Builder.access$2600(builder);
        this.nft_rating = Builder.access$2700(builder);
        this.nft_accessory_id = Builder.access$2800(builder);
        this.nft_contract_address = Builder.access$2900(builder);
        this.nft_item_id = Builder.access$3000(builder);
        this.sort = Builder.access$3100(builder);
        this.section_index = Builder.access$3200(builder);
        this.sort_category = Builder.access$3300(builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Snoovatar)) {
            return false;
        }
        final Snoovatar snoovatar = (Snoovatar)o;
        final String gear_id = this.gear_id;
        final String gear_id2 = snoovatar.gear_id;
        if (gear_id == gear_id2 || (gear_id != null && gear_id.equals(gear_id2))) {
            final List<String> gear_ids = this.gear_ids;
            final List<String> gear_ids2 = snoovatar.gear_ids;
            if (gear_ids == gear_ids2 || (gear_ids != null && gear_ids.equals(gear_ids2))) {
                final Boolean snoovatar_active = this.snoovatar_active;
                final Boolean snoovatar_active2 = snoovatar.snoovatar_active;
                if (snoovatar_active == snoovatar_active2 || (snoovatar_active != null && snoovatar_active.equals(snoovatar_active2))) {
                    final Long id = this.id;
                    final Long id2 = snoovatar.id;
                    if (id == id2 || (id != null && id.equals(id2))) {
                        final String full_image_url = this.full_image_url;
                        final String full_image_url2 = snoovatar.full_image_url;
                        if (full_image_url == full_image_url2 || (full_image_url != null && full_image_url.equals(full_image_url2))) {
                            final String headshot_image_url = this.headshot_image_url;
                            final String headshot_image_url2 = snoovatar.headshot_image_url;
                            if (headshot_image_url == headshot_image_url2 || (headshot_image_url != null && headshot_image_url.equals(headshot_image_url2))) {
                                final String gear_expression = this.gear_expression;
                                final String gear_expression2 = snoovatar.gear_expression;
                                if (gear_expression == gear_expression2 || (gear_expression != null && gear_expression.equals(gear_expression2))) {
                                    final String gear_hair = this.gear_hair;
                                    final String gear_hair2 = snoovatar.gear_hair;
                                    if (gear_hair == gear_hair2 || (gear_hair != null && gear_hair.equals(gear_hair2))) {
                                        final String gear_hair_acc = this.gear_hair_acc;
                                        final String gear_hair_acc2 = snoovatar.gear_hair_acc;
                                        if (gear_hair_acc == gear_hair_acc2 || (gear_hair_acc != null && gear_hair_acc.equals(gear_hair_acc2))) {
                                            final String gear_face = this.gear_face;
                                            final String gear_face2 = snoovatar.gear_face;
                                            if (gear_face == gear_face2 || (gear_face != null && gear_face.equals(gear_face2))) {
                                                final String gear_face_acc = this.gear_face_acc;
                                                final String gear_face_acc2 = snoovatar.gear_face_acc;
                                                if (gear_face_acc == gear_face_acc2 || (gear_face_acc != null && gear_face_acc.equals(gear_face_acc2))) {
                                                    final String gear_top = this.gear_top;
                                                    final String gear_top2 = snoovatar.gear_top;
                                                    if (gear_top == gear_top2 || (gear_top != null && gear_top.equals(gear_top2))) {
                                                        final String gear_top_acc = this.gear_top_acc;
                                                        final String gear_top_acc2 = snoovatar.gear_top_acc;
                                                        if (gear_top_acc == gear_top_acc2 || (gear_top_acc != null && gear_top_acc.equals(gear_top_acc2))) {
                                                            final String gear_bottom = this.gear_bottom;
                                                            final String gear_bottom2 = snoovatar.gear_bottom;
                                                            if (gear_bottom == gear_bottom2 || (gear_bottom != null && gear_bottom.equals(gear_bottom2))) {
                                                                final String gear_bottom_acc = this.gear_bottom_acc;
                                                                final String gear_bottom_acc2 = snoovatar.gear_bottom_acc;
                                                                if (gear_bottom_acc == gear_bottom_acc2 || (gear_bottom_acc != null && gear_bottom_acc.equals(gear_bottom_acc2))) {
                                                                    final Boolean has_premium_gear = this.has_premium_gear;
                                                                    final Boolean has_premium_gear2 = snoovatar.has_premium_gear;
                                                                    if (has_premium_gear == has_premium_gear2 || (has_premium_gear != null && has_premium_gear.equals(has_premium_gear2))) {
                                                                        final String gear_status = this.gear_status;
                                                                        final String gear_status2 = snoovatar.gear_status;
                                                                        if (gear_status == gear_status2 || (gear_status != null && gear_status.equals(gear_status2))) {
                                                                            final String user_generated = this.user_generated;
                                                                            final String user_generated2 = snoovatar.user_generated;
                                                                            if (user_generated == user_generated2 || (user_generated != null && user_generated.equals(user_generated2))) {
                                                                                final String user_generated_source = this.user_generated_source;
                                                                                final String user_generated_source2 = snoovatar.user_generated_source;
                                                                                if (user_generated_source == user_generated_source2 || (user_generated_source != null && user_generated_source.equals(user_generated_source2))) {
                                                                                    final Boolean user_has_nft = this.user_has_nft;
                                                                                    final Boolean user_has_nft2 = snoovatar.user_has_nft;
                                                                                    if (user_has_nft == user_has_nft2 || (user_has_nft != null && user_has_nft.equals(user_has_nft2))) {
                                                                                        final String nft_name = this.nft_name;
                                                                                        final String nft_name2 = snoovatar.nft_name;
                                                                                        if (nft_name == nft_name2 || (nft_name != null && nft_name.equals(nft_name2))) {
                                                                                            final List<String> gear_states = this.gear_states;
                                                                                            final List<String> gear_states2 = snoovatar.gear_states;
                                                                                            if (gear_states == gear_states2 || (gear_states != null && gear_states.equals(gear_states2))) {
                                                                                                final String snoovatar_name = this.snoovatar_name;
                                                                                                final String snoovatar_name2 = snoovatar.snoovatar_name;
                                                                                                if (snoovatar_name == snoovatar_name2 || (snoovatar_name != null && snoovatar_name.equals(snoovatar_name2))) {
                                                                                                    final String section_name = this.section_name;
                                                                                                    final String section_name2 = snoovatar.section_name;
                                                                                                    if (section_name == section_name2 || (section_name != null && section_name.equals(section_name2))) {
                                                                                                        final String nft_token_id = this.nft_token_id;
                                                                                                        final String nft_token_id2 = snoovatar.nft_token_id;
                                                                                                        if (nft_token_id == nft_token_id2 || (nft_token_id != null && nft_token_id.equals(nft_token_id2))) {
                                                                                                            final String nft_wallet_address = this.nft_wallet_address;
                                                                                                            final String nft_wallet_address2 = snoovatar.nft_wallet_address;
                                                                                                            if (nft_wallet_address == nft_wallet_address2 || (nft_wallet_address != null && nft_wallet_address.equals(nft_wallet_address2))) {
                                                                                                                final String nft_rating = this.nft_rating;
                                                                                                                final String nft_rating2 = snoovatar.nft_rating;
                                                                                                                if (nft_rating == nft_rating2 || (nft_rating != null && nft_rating.equals(nft_rating2))) {
                                                                                                                    final String nft_accessory_id = this.nft_accessory_id;
                                                                                                                    final String nft_accessory_id2 = snoovatar.nft_accessory_id;
                                                                                                                    if (nft_accessory_id == nft_accessory_id2 || (nft_accessory_id != null && nft_accessory_id.equals(nft_accessory_id2))) {
                                                                                                                        final String nft_contract_address = this.nft_contract_address;
                                                                                                                        final String nft_contract_address2 = snoovatar.nft_contract_address;
                                                                                                                        if (nft_contract_address == nft_contract_address2 || (nft_contract_address != null && nft_contract_address.equals(nft_contract_address2))) {
                                                                                                                            final String nft_item_id = this.nft_item_id;
                                                                                                                            final String nft_item_id2 = snoovatar.nft_item_id;
                                                                                                                            if (nft_item_id == nft_item_id2 || (nft_item_id != null && nft_item_id.equals(nft_item_id2))) {
                                                                                                                                final String sort = this.sort;
                                                                                                                                final String sort2 = snoovatar.sort;
                                                                                                                                if (sort == sort2 || (sort != null && sort.equals(sort2))) {
                                                                                                                                    final Long section_index = this.section_index;
                                                                                                                                    final Long section_index2 = snoovatar.section_index;
                                                                                                                                    if (section_index == section_index2 || (section_index != null && section_index.equals(section_index2))) {
                                                                                                                                        final String sort_category = this.sort_category;
                                                                                                                                        final String sort_category2 = snoovatar.sort_category;
                                                                                                                                        boolean b2 = b;
                                                                                                                                        if (sort_category == sort_category2) {
                                                                                                                                            return b2;
                                                                                                                                        }
                                                                                                                                        if (sort_category != null && sort_category.equals(sort_category2)) {
                                                                                                                                            b2 = b;
                                                                                                                                            return b2;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String gear_id = this.gear_id;
        int hashCode = 0;
        int hashCode2;
        if (gear_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = gear_id.hashCode();
        }
        final List<String> gear_ids = this.gear_ids;
        int hashCode3;
        if (gear_ids == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = gear_ids.hashCode();
        }
        final Boolean snoovatar_active = this.snoovatar_active;
        int hashCode4;
        if (snoovatar_active == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = snoovatar_active.hashCode();
        }
        final Long id = this.id;
        int hashCode5;
        if (id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = id.hashCode();
        }
        final String full_image_url = this.full_image_url;
        int hashCode6;
        if (full_image_url == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = full_image_url.hashCode();
        }
        final String headshot_image_url = this.headshot_image_url;
        int hashCode7;
        if (headshot_image_url == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = headshot_image_url.hashCode();
        }
        final String gear_expression = this.gear_expression;
        int hashCode8;
        if (gear_expression == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = gear_expression.hashCode();
        }
        final String gear_hair = this.gear_hair;
        int hashCode9;
        if (gear_hair == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = gear_hair.hashCode();
        }
        final String gear_hair_acc = this.gear_hair_acc;
        int hashCode10;
        if (gear_hair_acc == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = gear_hair_acc.hashCode();
        }
        final String gear_face = this.gear_face;
        int hashCode11;
        if (gear_face == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = gear_face.hashCode();
        }
        final String gear_face_acc = this.gear_face_acc;
        int hashCode12;
        if (gear_face_acc == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = gear_face_acc.hashCode();
        }
        final String gear_top = this.gear_top;
        int hashCode13;
        if (gear_top == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = gear_top.hashCode();
        }
        final String gear_top_acc = this.gear_top_acc;
        int hashCode14;
        if (gear_top_acc == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = gear_top_acc.hashCode();
        }
        final String gear_bottom = this.gear_bottom;
        int hashCode15;
        if (gear_bottom == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = gear_bottom.hashCode();
        }
        final String gear_bottom_acc = this.gear_bottom_acc;
        int hashCode16;
        if (gear_bottom_acc == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = gear_bottom_acc.hashCode();
        }
        final Boolean has_premium_gear = this.has_premium_gear;
        int hashCode17;
        if (has_premium_gear == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = has_premium_gear.hashCode();
        }
        final String gear_status = this.gear_status;
        int hashCode18;
        if (gear_status == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = gear_status.hashCode();
        }
        final String user_generated = this.user_generated;
        int hashCode19;
        if (user_generated == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = user_generated.hashCode();
        }
        final String user_generated_source = this.user_generated_source;
        int hashCode20;
        if (user_generated_source == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = user_generated_source.hashCode();
        }
        final Boolean user_has_nft = this.user_has_nft;
        int hashCode21;
        if (user_has_nft == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = user_has_nft.hashCode();
        }
        final String nft_name = this.nft_name;
        int hashCode22;
        if (nft_name == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = nft_name.hashCode();
        }
        final List<String> gear_states = this.gear_states;
        int hashCode23;
        if (gear_states == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = gear_states.hashCode();
        }
        final String snoovatar_name = this.snoovatar_name;
        int hashCode24;
        if (snoovatar_name == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = snoovatar_name.hashCode();
        }
        final String section_name = this.section_name;
        int hashCode25;
        if (section_name == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = section_name.hashCode();
        }
        final String nft_token_id = this.nft_token_id;
        int hashCode26;
        if (nft_token_id == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = nft_token_id.hashCode();
        }
        final String nft_wallet_address = this.nft_wallet_address;
        int hashCode27;
        if (nft_wallet_address == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = nft_wallet_address.hashCode();
        }
        final String nft_rating = this.nft_rating;
        int hashCode28;
        if (nft_rating == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = nft_rating.hashCode();
        }
        final String nft_accessory_id = this.nft_accessory_id;
        int hashCode29;
        if (nft_accessory_id == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = nft_accessory_id.hashCode();
        }
        final String nft_contract_address = this.nft_contract_address;
        int hashCode30;
        if (nft_contract_address == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = nft_contract_address.hashCode();
        }
        final String nft_item_id = this.nft_item_id;
        int hashCode31;
        if (nft_item_id == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = nft_item_id.hashCode();
        }
        final String sort = this.sort;
        int hashCode32;
        if (sort == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = sort.hashCode();
        }
        final Long section_index = this.section_index;
        int hashCode33;
        if (section_index == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = section_index.hashCode();
        }
        final String sort_category = this.sort_category;
        if (sort_category != null) {
            hashCode = sort_category.hashCode();
        }
        return (((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Snoovatar{gear_id=");
        k.append(this.gear_id);
        k.append(", gear_ids=");
        k.append(this.gear_ids);
        k.append(", snoovatar_active=");
        k.append(this.snoovatar_active);
        k.append(", id=");
        k.append(this.id);
        k.append(", full_image_url=");
        k.append(this.full_image_url);
        k.append(", headshot_image_url=");
        k.append(this.headshot_image_url);
        k.append(", gear_expression=");
        k.append(this.gear_expression);
        k.append(", gear_hair=");
        k.append(this.gear_hair);
        k.append(", gear_hair_acc=");
        k.append(this.gear_hair_acc);
        k.append(", gear_face=");
        k.append(this.gear_face);
        k.append(", gear_face_acc=");
        k.append(this.gear_face_acc);
        k.append(", gear_top=");
        k.append(this.gear_top);
        k.append(", gear_top_acc=");
        k.append(this.gear_top_acc);
        k.append(", gear_bottom=");
        k.append(this.gear_bottom);
        k.append(", gear_bottom_acc=");
        k.append(this.gear_bottom_acc);
        k.append(", has_premium_gear=");
        k.append(this.has_premium_gear);
        k.append(", gear_status=");
        k.append(this.gear_status);
        k.append(", user_generated=");
        k.append(this.user_generated);
        k.append(", user_generated_source=");
        k.append(this.user_generated_source);
        k.append(", user_has_nft=");
        k.append(this.user_has_nft);
        k.append(", nft_name=");
        k.append(this.nft_name);
        k.append(", gear_states=");
        k.append(this.gear_states);
        k.append(", snoovatar_name=");
        k.append(this.snoovatar_name);
        k.append(", section_name=");
        k.append(this.section_name);
        k.append(", nft_token_id=");
        k.append(this.nft_token_id);
        k.append(", nft_wallet_address=");
        k.append(this.nft_wallet_address);
        k.append(", nft_rating=");
        k.append(this.nft_rating);
        k.append(", nft_accessory_id=");
        k.append(this.nft_accessory_id);
        k.append(", nft_contract_address=");
        k.append(this.nft_contract_address);
        k.append(", nft_item_id=");
        k.append(this.nft_item_id);
        k.append(", sort=");
        k.append(this.sort);
        k.append(", section_index=");
        k.append(this.section_index);
        k.append(", sort_category=");
        return b.j(k, this.sort_category, "}");
    }
    
    public void write(final e e) throws IOException {
        Snoovatar.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Snoovatar>
    {
        private String full_image_url;
        private String gear_bottom;
        private String gear_bottom_acc;
        private String gear_expression;
        private String gear_face;
        private String gear_face_acc;
        private String gear_hair;
        private String gear_hair_acc;
        private String gear_id;
        private List<String> gear_ids;
        private List<String> gear_states;
        private String gear_status;
        private String gear_top;
        private String gear_top_acc;
        private Boolean has_premium_gear;
        private String headshot_image_url;
        private Long id;
        private String nft_accessory_id;
        private String nft_contract_address;
        private String nft_item_id;
        private String nft_name;
        private String nft_rating;
        private String nft_token_id;
        private String nft_wallet_address;
        private Long section_index;
        private String section_name;
        private Boolean snoovatar_active;
        private String snoovatar_name;
        private String sort;
        private String sort_category;
        private String user_generated;
        private String user_generated_source;
        private Boolean user_has_nft;
        
        public Builder() {
        }
        
        public Builder(final Snoovatar snoovatar) {
            this.gear_id = snoovatar.gear_id;
            this.gear_ids = snoovatar.gear_ids;
            this.snoovatar_active = snoovatar.snoovatar_active;
            this.id = snoovatar.id;
            this.full_image_url = snoovatar.full_image_url;
            this.headshot_image_url = snoovatar.headshot_image_url;
            this.gear_expression = snoovatar.gear_expression;
            this.gear_hair = snoovatar.gear_hair;
            this.gear_hair_acc = snoovatar.gear_hair_acc;
            this.gear_face = snoovatar.gear_face;
            this.gear_face_acc = snoovatar.gear_face_acc;
            this.gear_top = snoovatar.gear_top;
            this.gear_top_acc = snoovatar.gear_top_acc;
            this.gear_bottom = snoovatar.gear_bottom;
            this.gear_bottom_acc = snoovatar.gear_bottom_acc;
            this.has_premium_gear = snoovatar.has_premium_gear;
            this.gear_status = snoovatar.gear_status;
            this.user_generated = snoovatar.user_generated;
            this.user_generated_source = snoovatar.user_generated_source;
            this.user_has_nft = snoovatar.user_has_nft;
            this.nft_name = snoovatar.nft_name;
            this.gear_states = snoovatar.gear_states;
            this.snoovatar_name = snoovatar.snoovatar_name;
            this.section_name = snoovatar.section_name;
            this.nft_token_id = snoovatar.nft_token_id;
            this.nft_wallet_address = snoovatar.nft_wallet_address;
            this.nft_rating = snoovatar.nft_rating;
            this.nft_accessory_id = snoovatar.nft_accessory_id;
            this.nft_contract_address = snoovatar.nft_contract_address;
            this.nft_item_id = snoovatar.nft_item_id;
            this.sort = snoovatar.sort;
            this.section_index = snoovatar.section_index;
            this.sort_category = snoovatar.sort_category;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.gear_id;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.gear_face;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.gear_face_acc;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.gear_top;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.gear_top_acc;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.gear_bottom;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.gear_bottom_acc;
        }
        
        public static /* synthetic */ Boolean access$1600(final Builder builder) {
            return builder.has_premium_gear;
        }
        
        public static /* synthetic */ String access$1700(final Builder builder) {
            return builder.gear_status;
        }
        
        public static /* synthetic */ String access$1800(final Builder builder) {
            return builder.user_generated;
        }
        
        public static /* synthetic */ String access$1900(final Builder builder) {
            return builder.user_generated_source;
        }
        
        public static /* synthetic */ List access$200(final Builder builder) {
            return builder.gear_ids;
        }
        
        public static /* synthetic */ Boolean access$2000(final Builder builder) {
            return builder.user_has_nft;
        }
        
        public static /* synthetic */ String access$2100(final Builder builder) {
            return builder.nft_name;
        }
        
        public static /* synthetic */ List access$2200(final Builder builder) {
            return builder.gear_states;
        }
        
        public static /* synthetic */ String access$2300(final Builder builder) {
            return builder.snoovatar_name;
        }
        
        public static /* synthetic */ String access$2400(final Builder builder) {
            return builder.section_name;
        }
        
        public static /* synthetic */ String access$2500(final Builder builder) {
            return builder.nft_token_id;
        }
        
        public static /* synthetic */ String access$2600(final Builder builder) {
            return builder.nft_wallet_address;
        }
        
        public static /* synthetic */ String access$2700(final Builder builder) {
            return builder.nft_rating;
        }
        
        public static /* synthetic */ String access$2800(final Builder builder) {
            return builder.nft_accessory_id;
        }
        
        public static /* synthetic */ String access$2900(final Builder builder) {
            return builder.nft_contract_address;
        }
        
        public static /* synthetic */ Boolean access$300(final Builder builder) {
            return builder.snoovatar_active;
        }
        
        public static /* synthetic */ String access$3000(final Builder builder) {
            return builder.nft_item_id;
        }
        
        public static /* synthetic */ String access$3100(final Builder builder) {
            return builder.sort;
        }
        
        public static /* synthetic */ Long access$3200(final Builder builder) {
            return builder.section_index;
        }
        
        public static /* synthetic */ String access$3300(final Builder builder) {
            return builder.sort_category;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.full_image_url;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.headshot_image_url;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.gear_expression;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.gear_hair;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.gear_hair_acc;
        }
        
        public Snoovatar build() {
            return new Snoovatar(this, null);
        }
        
        public Builder full_image_url(final String full_image_url) {
            this.full_image_url = full_image_url;
            return this;
        }
        
        public Builder gear_bottom(final String gear_bottom) {
            this.gear_bottom = gear_bottom;
            return this;
        }
        
        public Builder gear_bottom_acc(final String gear_bottom_acc) {
            this.gear_bottom_acc = gear_bottom_acc;
            return this;
        }
        
        public Builder gear_expression(final String gear_expression) {
            this.gear_expression = gear_expression;
            return this;
        }
        
        public Builder gear_face(final String gear_face) {
            this.gear_face = gear_face;
            return this;
        }
        
        public Builder gear_face_acc(final String gear_face_acc) {
            this.gear_face_acc = gear_face_acc;
            return this;
        }
        
        public Builder gear_hair(final String gear_hair) {
            this.gear_hair = gear_hair;
            return this;
        }
        
        public Builder gear_hair_acc(final String gear_hair_acc) {
            this.gear_hair_acc = gear_hair_acc;
            return this;
        }
        
        public Builder gear_id(final String gear_id) {
            this.gear_id = gear_id;
            return this;
        }
        
        public Builder gear_ids(final List<String> gear_ids) {
            this.gear_ids = gear_ids;
            return this;
        }
        
        public Builder gear_states(final List<String> gear_states) {
            this.gear_states = gear_states;
            return this;
        }
        
        public Builder gear_status(final String gear_status) {
            this.gear_status = gear_status;
            return this;
        }
        
        public Builder gear_top(final String gear_top) {
            this.gear_top = gear_top;
            return this;
        }
        
        public Builder gear_top_acc(final String gear_top_acc) {
            this.gear_top_acc = gear_top_acc;
            return this;
        }
        
        public Builder has_premium_gear(final Boolean has_premium_gear) {
            this.has_premium_gear = has_premium_gear;
            return this;
        }
        
        public Builder headshot_image_url(final String headshot_image_url) {
            this.headshot_image_url = headshot_image_url;
            return this;
        }
        
        public Builder id(final Long id) {
            this.id = id;
            return this;
        }
        
        public Builder nft_accessory_id(final String nft_accessory_id) {
            this.nft_accessory_id = nft_accessory_id;
            return this;
        }
        
        public Builder nft_contract_address(final String nft_contract_address) {
            this.nft_contract_address = nft_contract_address;
            return this;
        }
        
        public Builder nft_item_id(final String nft_item_id) {
            this.nft_item_id = nft_item_id;
            return this;
        }
        
        public Builder nft_name(final String nft_name) {
            this.nft_name = nft_name;
            return this;
        }
        
        public Builder nft_rating(final String nft_rating) {
            this.nft_rating = nft_rating;
            return this;
        }
        
        public Builder nft_token_id(final String nft_token_id) {
            this.nft_token_id = nft_token_id;
            return this;
        }
        
        public Builder nft_wallet_address(final String nft_wallet_address) {
            this.nft_wallet_address = nft_wallet_address;
            return this;
        }
        
        public void reset() {
            this.gear_id = null;
            this.gear_ids = null;
            this.snoovatar_active = null;
            this.id = null;
            this.full_image_url = null;
            this.headshot_image_url = null;
            this.gear_expression = null;
            this.gear_hair = null;
            this.gear_hair_acc = null;
            this.gear_face = null;
            this.gear_face_acc = null;
            this.gear_top = null;
            this.gear_top_acc = null;
            this.gear_bottom = null;
            this.gear_bottom_acc = null;
            this.has_premium_gear = null;
            this.gear_status = null;
            this.user_generated = null;
            this.user_generated_source = null;
            this.user_has_nft = null;
            this.nft_name = null;
            this.gear_states = null;
            this.snoovatar_name = null;
            this.section_name = null;
            this.nft_token_id = null;
            this.nft_wallet_address = null;
            this.nft_rating = null;
            this.nft_accessory_id = null;
            this.nft_contract_address = null;
            this.nft_item_id = null;
            this.sort = null;
            this.section_index = null;
            this.sort_category = null;
        }
        
        public Builder section_index(final Long section_index) {
            this.section_index = section_index;
            return this;
        }
        
        public Builder section_name(final String section_name) {
            this.section_name = section_name;
            return this;
        }
        
        public Builder snoovatar_active(final Boolean snoovatar_active) {
            this.snoovatar_active = snoovatar_active;
            return this;
        }
        
        public Builder snoovatar_name(final String snoovatar_name) {
            this.snoovatar_name = snoovatar_name;
            return this;
        }
        
        public Builder sort(final String sort) {
            this.sort = sort;
            return this;
        }
        
        public Builder sort_category(final String sort_category) {
            this.sort_category = sort_category;
            return this;
        }
        
        public Builder user_generated(final String user_generated) {
            this.user_generated = user_generated;
            return this;
        }
        
        public Builder user_generated_source(final String user_generated_source) {
            this.user_generated_source = user_generated_source;
            return this;
        }
        
        public Builder user_has_nft(final Boolean user_has_nft) {
            this.user_has_nft = user_has_nft;
            return this;
        }
    }
    
    public static final class SnoovatarAdapter implements a<Snoovatar, Builder>
    {
        private SnoovatarAdapter() {
        }
        
        public Snoovatar read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Snoovatar read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                int i = 0;
                switch (b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 34: {
                        if (a == 11) {
                            builder.sort_category(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 32: {
                        if (a == 10) {
                            builder.section_index(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 31: {
                        if (a == 11) {
                            builder.sort(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 30: {
                        if (a == 11) {
                            builder.nft_item_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 29: {
                        if (a == 11) {
                            builder.nft_contract_address(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 28: {
                        if (a == 11) {
                            builder.nft_accessory_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 11) {
                            builder.nft_rating(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.nft_wallet_address(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 11) {
                            builder.nft_token_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 11) {
                            builder.section_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 11) {
                            builder.snoovatar_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = d.h(e, list, i, 1)) {}
                            e.x();
                            builder.gear_states((List<String>)list);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 11) {
                            builder.nft_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 2) {
                            builder.user_has_nft(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 11) {
                            builder.user_generated_source(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 11) {
                            builder.user_generated(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.gear_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 2) {
                            builder.has_premium_gear(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.gear_bottom_acc(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.gear_bottom(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.gear_top_acc(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.gear_top(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.gear_face_acc(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.gear_face(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.gear_hair_acc(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.gear_hair(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.gear_expression(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.headshot_image_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.full_image_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.id(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 2) {
                            builder.snoovatar_active(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = d.h(e, list2, j, 1)) {}
                            e.x();
                            builder.gear_ids((List<String>)list2);
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.gear_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Snoovatar snoovatar) throws IOException {
            e.a0();
            if (snoovatar.gear_id != null) {
                e.N(1, (byte)11);
                e.Z(snoovatar.gear_id);
                e.O();
            }
            if (snoovatar.gear_ids != null) {
                e.N(2, (byte)15);
                e.V((byte)11, snoovatar.gear_ids.size());
                final Iterator<String> iterator = snoovatar.gear_ids.iterator();
                while (iterator.hasNext()) {
                    e.Z((String)iterator.next());
                }
                e.X();
                e.O();
            }
            if (snoovatar.snoovatar_active != null) {
                e.N(3, (byte)2);
                d.z(snoovatar.snoovatar_active, e);
            }
            if (snoovatar.id != null) {
                e.N(4, (byte)10);
                a.r(snoovatar.id, e);
            }
            if (snoovatar.full_image_url != null) {
                e.N(5, (byte)11);
                e.Z(snoovatar.full_image_url);
                e.O();
            }
            if (snoovatar.headshot_image_url != null) {
                e.N(6, (byte)11);
                e.Z(snoovatar.headshot_image_url);
                e.O();
            }
            if (snoovatar.gear_expression != null) {
                e.N(7, (byte)11);
                e.Z(snoovatar.gear_expression);
                e.O();
            }
            if (snoovatar.gear_hair != null) {
                e.N(8, (byte)11);
                e.Z(snoovatar.gear_hair);
                e.O();
            }
            if (snoovatar.gear_hair_acc != null) {
                e.N(9, (byte)11);
                e.Z(snoovatar.gear_hair_acc);
                e.O();
            }
            if (snoovatar.gear_face != null) {
                e.N(10, (byte)11);
                e.Z(snoovatar.gear_face);
                e.O();
            }
            if (snoovatar.gear_face_acc != null) {
                e.N(11, (byte)11);
                e.Z(snoovatar.gear_face_acc);
                e.O();
            }
            if (snoovatar.gear_top != null) {
                e.N(12, (byte)11);
                e.Z(snoovatar.gear_top);
                e.O();
            }
            if (snoovatar.gear_top_acc != null) {
                e.N(13, (byte)11);
                e.Z(snoovatar.gear_top_acc);
                e.O();
            }
            if (snoovatar.gear_bottom != null) {
                e.N(14, (byte)11);
                e.Z(snoovatar.gear_bottom);
                e.O();
            }
            if (snoovatar.gear_bottom_acc != null) {
                e.N(15, (byte)11);
                e.Z(snoovatar.gear_bottom_acc);
                e.O();
            }
            if (snoovatar.has_premium_gear != null) {
                e.N(16, (byte)2);
                d.z(snoovatar.has_premium_gear, e);
            }
            if (snoovatar.gear_status != null) {
                e.N(17, (byte)11);
                e.Z(snoovatar.gear_status);
                e.O();
            }
            if (snoovatar.user_generated != null) {
                e.N(18, (byte)11);
                e.Z(snoovatar.user_generated);
                e.O();
            }
            if (snoovatar.user_generated_source != null) {
                e.N(19, (byte)11);
                e.Z(snoovatar.user_generated_source);
                e.O();
            }
            if (snoovatar.user_has_nft != null) {
                e.N(20, (byte)2);
                d.z(snoovatar.user_has_nft, e);
            }
            if (snoovatar.nft_name != null) {
                e.N(21, (byte)11);
                e.Z(snoovatar.nft_name);
                e.O();
            }
            if (snoovatar.gear_states != null) {
                e.N(22, (byte)15);
                e.V((byte)11, snoovatar.gear_states.size());
                final Iterator<String> iterator2 = snoovatar.gear_states.iterator();
                while (iterator2.hasNext()) {
                    e.Z((String)iterator2.next());
                }
                e.X();
                e.O();
            }
            if (snoovatar.snoovatar_name != null) {
                e.N(23, (byte)11);
                e.Z(snoovatar.snoovatar_name);
                e.O();
            }
            if (snoovatar.section_name != null) {
                e.N(24, (byte)11);
                e.Z(snoovatar.section_name);
                e.O();
            }
            if (snoovatar.nft_token_id != null) {
                e.N(25, (byte)11);
                e.Z(snoovatar.nft_token_id);
                e.O();
            }
            if (snoovatar.nft_wallet_address != null) {
                e.N(26, (byte)11);
                e.Z(snoovatar.nft_wallet_address);
                e.O();
            }
            if (snoovatar.nft_rating != null) {
                e.N(27, (byte)11);
                e.Z(snoovatar.nft_rating);
                e.O();
            }
            if (snoovatar.nft_accessory_id != null) {
                e.N(28, (byte)11);
                e.Z(snoovatar.nft_accessory_id);
                e.O();
            }
            if (snoovatar.nft_contract_address != null) {
                e.N(29, (byte)11);
                e.Z(snoovatar.nft_contract_address);
                e.O();
            }
            if (snoovatar.nft_item_id != null) {
                e.N(30, (byte)11);
                e.Z(snoovatar.nft_item_id);
                e.O();
            }
            if (snoovatar.sort != null) {
                e.N(31, (byte)11);
                e.Z(snoovatar.sort);
                e.O();
            }
            if (snoovatar.section_index != null) {
                e.N(32, (byte)10);
                a.r(snoovatar.section_index, e);
            }
            if (snoovatar.sort_category != null) {
                e.N(34, (byte)11);
                e.Z(snoovatar.sort_category);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
