// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Snoovatar
{
    public static final a<Snoovatar, Snoovatar.Snoovatar$Builder> ADAPTER;
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
        ADAPTER = (a)new Snoovatar.Snoovatar$SnoovatarAdapter((Snoovatar$1)null);
    }
    
    private Snoovatar(final Snoovatar.Snoovatar$Builder snoovatar$Builder) {
        this.gear_id = Snoovatar.Snoovatar$Builder.access$100(snoovatar$Builder);
        final List access$200 = Snoovatar.Snoovatar$Builder.access$200(snoovatar$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$200 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Snoovatar.Snoovatar$Builder.access$200(snoovatar$Builder));
        }
        this.gear_ids = unmodifiableList;
        this.snoovatar_active = Snoovatar.Snoovatar$Builder.access$300(snoovatar$Builder);
        this.id = Snoovatar.Snoovatar$Builder.access$400(snoovatar$Builder);
        this.full_image_url = Snoovatar.Snoovatar$Builder.access$500(snoovatar$Builder);
        this.headshot_image_url = Snoovatar.Snoovatar$Builder.access$600(snoovatar$Builder);
        this.gear_expression = Snoovatar.Snoovatar$Builder.access$700(snoovatar$Builder);
        this.gear_hair = Snoovatar.Snoovatar$Builder.access$800(snoovatar$Builder);
        this.gear_hair_acc = Snoovatar.Snoovatar$Builder.access$900(snoovatar$Builder);
        this.gear_face = Snoovatar.Snoovatar$Builder.access$1000(snoovatar$Builder);
        this.gear_face_acc = Snoovatar.Snoovatar$Builder.access$1100(snoovatar$Builder);
        this.gear_top = Snoovatar.Snoovatar$Builder.access$1200(snoovatar$Builder);
        this.gear_top_acc = Snoovatar.Snoovatar$Builder.access$1300(snoovatar$Builder);
        this.gear_bottom = Snoovatar.Snoovatar$Builder.access$1400(snoovatar$Builder);
        this.gear_bottom_acc = Snoovatar.Snoovatar$Builder.access$1500(snoovatar$Builder);
        this.has_premium_gear = Snoovatar.Snoovatar$Builder.access$1600(snoovatar$Builder);
        this.gear_status = Snoovatar.Snoovatar$Builder.access$1700(snoovatar$Builder);
        this.user_generated = Snoovatar.Snoovatar$Builder.access$1800(snoovatar$Builder);
        this.user_generated_source = Snoovatar.Snoovatar$Builder.access$1900(snoovatar$Builder);
        this.user_has_nft = Snoovatar.Snoovatar$Builder.access$2000(snoovatar$Builder);
        this.nft_name = Snoovatar.Snoovatar$Builder.access$2100(snoovatar$Builder);
        List<String> unmodifiableList2;
        if (Snoovatar.Snoovatar$Builder.access$2200(snoovatar$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Snoovatar.Snoovatar$Builder.access$2200(snoovatar$Builder));
        }
        this.gear_states = unmodifiableList2;
        this.snoovatar_name = Snoovatar.Snoovatar$Builder.access$2300(snoovatar$Builder);
        this.section_name = Snoovatar.Snoovatar$Builder.access$2400(snoovatar$Builder);
        this.nft_token_id = Snoovatar.Snoovatar$Builder.access$2500(snoovatar$Builder);
        this.nft_wallet_address = Snoovatar.Snoovatar$Builder.access$2600(snoovatar$Builder);
        this.nft_rating = Snoovatar.Snoovatar$Builder.access$2700(snoovatar$Builder);
        this.nft_accessory_id = Snoovatar.Snoovatar$Builder.access$2800(snoovatar$Builder);
        this.nft_contract_address = Snoovatar.Snoovatar$Builder.access$2900(snoovatar$Builder);
        this.nft_item_id = Snoovatar.Snoovatar$Builder.access$3000(snoovatar$Builder);
        this.sort = Snoovatar.Snoovatar$Builder.access$3100(snoovatar$Builder);
        this.section_index = Snoovatar.Snoovatar$Builder.access$3200(snoovatar$Builder);
        this.sort_category = Snoovatar.Snoovatar$Builder.access$3300(snoovatar$Builder);
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
        final StringBuilder r = a.r("Snoovatar{gear_id=");
        r.append(this.gear_id);
        r.append(", gear_ids=");
        r.append(this.gear_ids);
        r.append(", snoovatar_active=");
        r.append(this.snoovatar_active);
        r.append(", id=");
        r.append(this.id);
        r.append(", full_image_url=");
        r.append(this.full_image_url);
        r.append(", headshot_image_url=");
        r.append(this.headshot_image_url);
        r.append(", gear_expression=");
        r.append(this.gear_expression);
        r.append(", gear_hair=");
        r.append(this.gear_hair);
        r.append(", gear_hair_acc=");
        r.append(this.gear_hair_acc);
        r.append(", gear_face=");
        r.append(this.gear_face);
        r.append(", gear_face_acc=");
        r.append(this.gear_face_acc);
        r.append(", gear_top=");
        r.append(this.gear_top);
        r.append(", gear_top_acc=");
        r.append(this.gear_top_acc);
        r.append(", gear_bottom=");
        r.append(this.gear_bottom);
        r.append(", gear_bottom_acc=");
        r.append(this.gear_bottom_acc);
        r.append(", has_premium_gear=");
        r.append(this.has_premium_gear);
        r.append(", gear_status=");
        r.append(this.gear_status);
        r.append(", user_generated=");
        r.append(this.user_generated);
        r.append(", user_generated_source=");
        r.append(this.user_generated_source);
        r.append(", user_has_nft=");
        r.append(this.user_has_nft);
        r.append(", nft_name=");
        r.append(this.nft_name);
        r.append(", gear_states=");
        r.append(this.gear_states);
        r.append(", snoovatar_name=");
        r.append(this.snoovatar_name);
        r.append(", section_name=");
        r.append(this.section_name);
        r.append(", nft_token_id=");
        r.append(this.nft_token_id);
        r.append(", nft_wallet_address=");
        r.append(this.nft_wallet_address);
        r.append(", nft_rating=");
        r.append(this.nft_rating);
        r.append(", nft_accessory_id=");
        r.append(this.nft_accessory_id);
        r.append(", nft_contract_address=");
        r.append(this.nft_contract_address);
        r.append(", nft_item_id=");
        r.append(this.nft_item_id);
        r.append(", sort=");
        r.append(this.sort);
        r.append(", section_index=");
        r.append(this.section_index);
        r.append(", sort_category=");
        return a.o(r, this.sort_category, "}");
    }
    
    public void write(final e e) throws IOException {
        Snoovatar.ADAPTER.write(e, (Object)this);
    }
}
