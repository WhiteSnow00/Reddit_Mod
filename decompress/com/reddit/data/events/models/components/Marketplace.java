// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Marketplace
{
    public static final a<Marketplace, Builder> ADAPTER;
    public final String choice_id;
    public final Long claim_selection_count;
    public final String config_shop_description;
    public final String config_shop_header;
    public final String config_shop_id;
    public final String discover_category_name;
    public final String error;
    public final String group_id;
    public final String item_id;
    public final String item_name;
    public final String item_rarity;
    public final String item_token_contract_address;
    public final String item_token_id;
    public final String link_type;
    public final String link_url;
    public final String listing_currency;
    public final String listing_id;
    public final Long listing_price;
    public final Long listing_quantity;
    public final String nft_status;
    public final Long page_index;
    public final String preview_type;
    public final String shop_badge_name;
    public final String shop_sticker_name;
    public final String wallet_address;
    public final String wallet_address_target_owner;
    
    static {
        ADAPTER = (a)new MarketplaceAdapter(null);
    }
    
    private Marketplace(final Builder builder) {
        this.listing_id = Builder.access$100(builder);
        this.group_id = Builder.access$200(builder);
        this.item_id = Builder.access$300(builder);
        this.item_name = Builder.access$400(builder);
        this.item_token_id = Builder.access$500(builder);
        this.item_token_contract_address = Builder.access$600(builder);
        this.item_rarity = Builder.access$700(builder);
        this.listing_price = Builder.access$800(builder);
        this.listing_currency = Builder.access$900(builder);
        this.listing_quantity = Builder.access$1000(builder);
        this.wallet_address = Builder.access$1100(builder);
        this.nft_status = Builder.access$1200(builder);
        this.link_type = Builder.access$1300(builder);
        this.link_url = Builder.access$1400(builder);
        this.preview_type = Builder.access$1500(builder);
        this.page_index = Builder.access$1600(builder);
        this.wallet_address_target_owner = Builder.access$1700(builder);
        this.error = Builder.access$1800(builder);
        this.claim_selection_count = Builder.access$1900(builder);
        this.config_shop_id = Builder.access$2000(builder);
        this.config_shop_header = Builder.access$2100(builder);
        this.config_shop_description = Builder.access$2200(builder);
        this.discover_category_name = Builder.access$2300(builder);
        this.shop_badge_name = Builder.access$2400(builder);
        this.shop_sticker_name = Builder.access$2500(builder);
        this.choice_id = Builder.access$2600(builder);
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
        if (!(o instanceof Marketplace)) {
            return false;
        }
        final Marketplace marketplace = (Marketplace)o;
        final String listing_id = this.listing_id;
        final String listing_id2 = marketplace.listing_id;
        if (listing_id == listing_id2 || (listing_id != null && listing_id.equals(listing_id2))) {
            final String group_id = this.group_id;
            final String group_id2 = marketplace.group_id;
            if (group_id == group_id2 || (group_id != null && group_id.equals(group_id2))) {
                final String item_id = this.item_id;
                final String item_id2 = marketplace.item_id;
                if (item_id == item_id2 || (item_id != null && item_id.equals(item_id2))) {
                    final String item_name = this.item_name;
                    final String item_name2 = marketplace.item_name;
                    if (item_name == item_name2 || (item_name != null && item_name.equals(item_name2))) {
                        final String item_token_id = this.item_token_id;
                        final String item_token_id2 = marketplace.item_token_id;
                        if (item_token_id == item_token_id2 || (item_token_id != null && item_token_id.equals(item_token_id2))) {
                            final String item_token_contract_address = this.item_token_contract_address;
                            final String item_token_contract_address2 = marketplace.item_token_contract_address;
                            if (item_token_contract_address == item_token_contract_address2 || (item_token_contract_address != null && item_token_contract_address.equals(item_token_contract_address2))) {
                                final String item_rarity = this.item_rarity;
                                final String item_rarity2 = marketplace.item_rarity;
                                if (item_rarity == item_rarity2 || (item_rarity != null && item_rarity.equals(item_rarity2))) {
                                    final Long listing_price = this.listing_price;
                                    final Long listing_price2 = marketplace.listing_price;
                                    if (listing_price == listing_price2 || (listing_price != null && listing_price.equals(listing_price2))) {
                                        final String listing_currency = this.listing_currency;
                                        final String listing_currency2 = marketplace.listing_currency;
                                        if (listing_currency == listing_currency2 || (listing_currency != null && listing_currency.equals(listing_currency2))) {
                                            final Long listing_quantity = this.listing_quantity;
                                            final Long listing_quantity2 = marketplace.listing_quantity;
                                            if (listing_quantity == listing_quantity2 || (listing_quantity != null && listing_quantity.equals(listing_quantity2))) {
                                                final String wallet_address = this.wallet_address;
                                                final String wallet_address2 = marketplace.wallet_address;
                                                if (wallet_address == wallet_address2 || (wallet_address != null && wallet_address.equals(wallet_address2))) {
                                                    final String nft_status = this.nft_status;
                                                    final String nft_status2 = marketplace.nft_status;
                                                    if (nft_status == nft_status2 || (nft_status != null && nft_status.equals(nft_status2))) {
                                                        final String link_type = this.link_type;
                                                        final String link_type2 = marketplace.link_type;
                                                        if (link_type == link_type2 || (link_type != null && link_type.equals(link_type2))) {
                                                            final String link_url = this.link_url;
                                                            final String link_url2 = marketplace.link_url;
                                                            if (link_url == link_url2 || (link_url != null && link_url.equals(link_url2))) {
                                                                final String preview_type = this.preview_type;
                                                                final String preview_type2 = marketplace.preview_type;
                                                                if (preview_type == preview_type2 || (preview_type != null && preview_type.equals(preview_type2))) {
                                                                    final Long page_index = this.page_index;
                                                                    final Long page_index2 = marketplace.page_index;
                                                                    if (page_index == page_index2 || (page_index != null && page_index.equals(page_index2))) {
                                                                        final String wallet_address_target_owner = this.wallet_address_target_owner;
                                                                        final String wallet_address_target_owner2 = marketplace.wallet_address_target_owner;
                                                                        if (wallet_address_target_owner == wallet_address_target_owner2 || (wallet_address_target_owner != null && wallet_address_target_owner.equals(wallet_address_target_owner2))) {
                                                                            final String error = this.error;
                                                                            final String error2 = marketplace.error;
                                                                            if (error == error2 || (error != null && error.equals(error2))) {
                                                                                final Long claim_selection_count = this.claim_selection_count;
                                                                                final Long claim_selection_count2 = marketplace.claim_selection_count;
                                                                                if (claim_selection_count == claim_selection_count2 || (claim_selection_count != null && claim_selection_count.equals(claim_selection_count2))) {
                                                                                    final String config_shop_id = this.config_shop_id;
                                                                                    final String config_shop_id2 = marketplace.config_shop_id;
                                                                                    if (config_shop_id == config_shop_id2 || (config_shop_id != null && config_shop_id.equals(config_shop_id2))) {
                                                                                        final String config_shop_header = this.config_shop_header;
                                                                                        final String config_shop_header2 = marketplace.config_shop_header;
                                                                                        if (config_shop_header == config_shop_header2 || (config_shop_header != null && config_shop_header.equals(config_shop_header2))) {
                                                                                            final String config_shop_description = this.config_shop_description;
                                                                                            final String config_shop_description2 = marketplace.config_shop_description;
                                                                                            if (config_shop_description == config_shop_description2 || (config_shop_description != null && config_shop_description.equals(config_shop_description2))) {
                                                                                                final String discover_category_name = this.discover_category_name;
                                                                                                final String discover_category_name2 = marketplace.discover_category_name;
                                                                                                if (discover_category_name == discover_category_name2 || (discover_category_name != null && discover_category_name.equals(discover_category_name2))) {
                                                                                                    final String shop_badge_name = this.shop_badge_name;
                                                                                                    final String shop_badge_name2 = marketplace.shop_badge_name;
                                                                                                    if (shop_badge_name == shop_badge_name2 || (shop_badge_name != null && shop_badge_name.equals(shop_badge_name2))) {
                                                                                                        final String shop_sticker_name = this.shop_sticker_name;
                                                                                                        final String shop_sticker_name2 = marketplace.shop_sticker_name;
                                                                                                        if (shop_sticker_name == shop_sticker_name2 || (shop_sticker_name != null && shop_sticker_name.equals(shop_sticker_name2))) {
                                                                                                            final String choice_id = this.choice_id;
                                                                                                            final String choice_id2 = marketplace.choice_id;
                                                                                                            boolean b2 = b;
                                                                                                            if (choice_id == choice_id2) {
                                                                                                                return b2;
                                                                                                            }
                                                                                                            if (choice_id != null && choice_id.equals(choice_id2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String listing_id = this.listing_id;
        int hashCode = 0;
        int hashCode2;
        if (listing_id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = listing_id.hashCode();
        }
        final String group_id = this.group_id;
        int hashCode3;
        if (group_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = group_id.hashCode();
        }
        final String item_id = this.item_id;
        int hashCode4;
        if (item_id == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = item_id.hashCode();
        }
        final String item_name = this.item_name;
        int hashCode5;
        if (item_name == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = item_name.hashCode();
        }
        final String item_token_id = this.item_token_id;
        int hashCode6;
        if (item_token_id == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = item_token_id.hashCode();
        }
        final String item_token_contract_address = this.item_token_contract_address;
        int hashCode7;
        if (item_token_contract_address == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = item_token_contract_address.hashCode();
        }
        final String item_rarity = this.item_rarity;
        int hashCode8;
        if (item_rarity == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = item_rarity.hashCode();
        }
        final Long listing_price = this.listing_price;
        int hashCode9;
        if (listing_price == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = listing_price.hashCode();
        }
        final String listing_currency = this.listing_currency;
        int hashCode10;
        if (listing_currency == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = listing_currency.hashCode();
        }
        final Long listing_quantity = this.listing_quantity;
        int hashCode11;
        if (listing_quantity == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = listing_quantity.hashCode();
        }
        final String wallet_address = this.wallet_address;
        int hashCode12;
        if (wallet_address == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = wallet_address.hashCode();
        }
        final String nft_status = this.nft_status;
        int hashCode13;
        if (nft_status == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = nft_status.hashCode();
        }
        final String link_type = this.link_type;
        int hashCode14;
        if (link_type == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = link_type.hashCode();
        }
        final String link_url = this.link_url;
        int hashCode15;
        if (link_url == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = link_url.hashCode();
        }
        final String preview_type = this.preview_type;
        int hashCode16;
        if (preview_type == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = preview_type.hashCode();
        }
        final Long page_index = this.page_index;
        int hashCode17;
        if (page_index == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = page_index.hashCode();
        }
        final String wallet_address_target_owner = this.wallet_address_target_owner;
        int hashCode18;
        if (wallet_address_target_owner == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = wallet_address_target_owner.hashCode();
        }
        final String error = this.error;
        int hashCode19;
        if (error == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = error.hashCode();
        }
        final Long claim_selection_count = this.claim_selection_count;
        int hashCode20;
        if (claim_selection_count == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = claim_selection_count.hashCode();
        }
        final String config_shop_id = this.config_shop_id;
        int hashCode21;
        if (config_shop_id == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = config_shop_id.hashCode();
        }
        final String config_shop_header = this.config_shop_header;
        int hashCode22;
        if (config_shop_header == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = config_shop_header.hashCode();
        }
        final String config_shop_description = this.config_shop_description;
        int hashCode23;
        if (config_shop_description == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = config_shop_description.hashCode();
        }
        final String discover_category_name = this.discover_category_name;
        int hashCode24;
        if (discover_category_name == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = discover_category_name.hashCode();
        }
        final String shop_badge_name = this.shop_badge_name;
        int hashCode25;
        if (shop_badge_name == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = shop_badge_name.hashCode();
        }
        final String shop_sticker_name = this.shop_sticker_name;
        int hashCode26;
        if (shop_sticker_name == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = shop_sticker_name.hashCode();
        }
        final String choice_id = this.choice_id;
        if (choice_id != null) {
            hashCode = choice_id.hashCode();
        }
        return ((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Marketplace{listing_id=");
        k.append(this.listing_id);
        k.append(", group_id=");
        k.append(this.group_id);
        k.append(", item_id=");
        k.append(this.item_id);
        k.append(", item_name=");
        k.append(this.item_name);
        k.append(", item_token_id=");
        k.append(this.item_token_id);
        k.append(", item_token_contract_address=");
        k.append(this.item_token_contract_address);
        k.append(", item_rarity=");
        k.append(this.item_rarity);
        k.append(", listing_price=");
        k.append(this.listing_price);
        k.append(", listing_currency=");
        k.append(this.listing_currency);
        k.append(", listing_quantity=");
        k.append(this.listing_quantity);
        k.append(", wallet_address=");
        k.append(this.wallet_address);
        k.append(", nft_status=");
        k.append(this.nft_status);
        k.append(", link_type=");
        k.append(this.link_type);
        k.append(", link_url=");
        k.append(this.link_url);
        k.append(", preview_type=");
        k.append(this.preview_type);
        k.append(", page_index=");
        k.append(this.page_index);
        k.append(", wallet_address_target_owner=");
        k.append(this.wallet_address_target_owner);
        k.append(", error=");
        k.append(this.error);
        k.append(", claim_selection_count=");
        k.append(this.claim_selection_count);
        k.append(", config_shop_id=");
        k.append(this.config_shop_id);
        k.append(", config_shop_header=");
        k.append(this.config_shop_header);
        k.append(", config_shop_description=");
        k.append(this.config_shop_description);
        k.append(", discover_category_name=");
        k.append(this.discover_category_name);
        k.append(", shop_badge_name=");
        k.append(this.shop_badge_name);
        k.append(", shop_sticker_name=");
        k.append(this.shop_sticker_name);
        k.append(", choice_id=");
        return b.j(k, this.choice_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Marketplace.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Marketplace>
    {
        private String choice_id;
        private Long claim_selection_count;
        private String config_shop_description;
        private String config_shop_header;
        private String config_shop_id;
        private String discover_category_name;
        private String error;
        private String group_id;
        private String item_id;
        private String item_name;
        private String item_rarity;
        private String item_token_contract_address;
        private String item_token_id;
        private String link_type;
        private String link_url;
        private String listing_currency;
        private String listing_id;
        private Long listing_price;
        private Long listing_quantity;
        private String nft_status;
        private Long page_index;
        private String preview_type;
        private String shop_badge_name;
        private String shop_sticker_name;
        private String wallet_address;
        private String wallet_address_target_owner;
        
        public Builder() {
        }
        
        public Builder(final Marketplace marketplace) {
            this.listing_id = marketplace.listing_id;
            this.group_id = marketplace.group_id;
            this.item_id = marketplace.item_id;
            this.item_name = marketplace.item_name;
            this.item_token_id = marketplace.item_token_id;
            this.item_token_contract_address = marketplace.item_token_contract_address;
            this.item_rarity = marketplace.item_rarity;
            this.listing_price = marketplace.listing_price;
            this.listing_currency = marketplace.listing_currency;
            this.listing_quantity = marketplace.listing_quantity;
            this.wallet_address = marketplace.wallet_address;
            this.nft_status = marketplace.nft_status;
            this.link_type = marketplace.link_type;
            this.link_url = marketplace.link_url;
            this.preview_type = marketplace.preview_type;
            this.page_index = marketplace.page_index;
            this.wallet_address_target_owner = marketplace.wallet_address_target_owner;
            this.error = marketplace.error;
            this.claim_selection_count = marketplace.claim_selection_count;
            this.config_shop_id = marketplace.config_shop_id;
            this.config_shop_header = marketplace.config_shop_header;
            this.config_shop_description = marketplace.config_shop_description;
            this.discover_category_name = marketplace.discover_category_name;
            this.shop_badge_name = marketplace.shop_badge_name;
            this.shop_sticker_name = marketplace.shop_sticker_name;
            this.choice_id = marketplace.choice_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.listing_id;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.listing_quantity;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.wallet_address;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.nft_status;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.link_type;
        }
        
        public static /* synthetic */ String access$1400(final Builder builder) {
            return builder.link_url;
        }
        
        public static /* synthetic */ String access$1500(final Builder builder) {
            return builder.preview_type;
        }
        
        public static /* synthetic */ Long access$1600(final Builder builder) {
            return builder.page_index;
        }
        
        public static /* synthetic */ String access$1700(final Builder builder) {
            return builder.wallet_address_target_owner;
        }
        
        public static /* synthetic */ String access$1800(final Builder builder) {
            return builder.error;
        }
        
        public static /* synthetic */ Long access$1900(final Builder builder) {
            return builder.claim_selection_count;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.group_id;
        }
        
        public static /* synthetic */ String access$2000(final Builder builder) {
            return builder.config_shop_id;
        }
        
        public static /* synthetic */ String access$2100(final Builder builder) {
            return builder.config_shop_header;
        }
        
        public static /* synthetic */ String access$2200(final Builder builder) {
            return builder.config_shop_description;
        }
        
        public static /* synthetic */ String access$2300(final Builder builder) {
            return builder.discover_category_name;
        }
        
        public static /* synthetic */ String access$2400(final Builder builder) {
            return builder.shop_badge_name;
        }
        
        public static /* synthetic */ String access$2500(final Builder builder) {
            return builder.shop_sticker_name;
        }
        
        public static /* synthetic */ String access$2600(final Builder builder) {
            return builder.choice_id;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.item_id;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.item_name;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.item_token_id;
        }
        
        public static /* synthetic */ String access$600(final Builder builder) {
            return builder.item_token_contract_address;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.item_rarity;
        }
        
        public static /* synthetic */ Long access$800(final Builder builder) {
            return builder.listing_price;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.listing_currency;
        }
        
        public Marketplace build() {
            return new Marketplace(this, null);
        }
        
        public Builder choice_id(final String choice_id) {
            this.choice_id = choice_id;
            return this;
        }
        
        public Builder claim_selection_count(final Long claim_selection_count) {
            this.claim_selection_count = claim_selection_count;
            return this;
        }
        
        public Builder config_shop_description(final String config_shop_description) {
            this.config_shop_description = config_shop_description;
            return this;
        }
        
        public Builder config_shop_header(final String config_shop_header) {
            this.config_shop_header = config_shop_header;
            return this;
        }
        
        public Builder config_shop_id(final String config_shop_id) {
            this.config_shop_id = config_shop_id;
            return this;
        }
        
        public Builder discover_category_name(final String discover_category_name) {
            this.discover_category_name = discover_category_name;
            return this;
        }
        
        public Builder error(final String error) {
            this.error = error;
            return this;
        }
        
        public Builder group_id(final String group_id) {
            this.group_id = group_id;
            return this;
        }
        
        public Builder item_id(final String item_id) {
            this.item_id = item_id;
            return this;
        }
        
        public Builder item_name(final String item_name) {
            this.item_name = item_name;
            return this;
        }
        
        public Builder item_rarity(final String item_rarity) {
            this.item_rarity = item_rarity;
            return this;
        }
        
        public Builder item_token_contract_address(final String item_token_contract_address) {
            this.item_token_contract_address = item_token_contract_address;
            return this;
        }
        
        public Builder item_token_id(final String item_token_id) {
            this.item_token_id = item_token_id;
            return this;
        }
        
        public Builder link_type(final String link_type) {
            this.link_type = link_type;
            return this;
        }
        
        public Builder link_url(final String link_url) {
            this.link_url = link_url;
            return this;
        }
        
        public Builder listing_currency(final String listing_currency) {
            this.listing_currency = listing_currency;
            return this;
        }
        
        public Builder listing_id(final String listing_id) {
            this.listing_id = listing_id;
            return this;
        }
        
        public Builder listing_price(final Long listing_price) {
            this.listing_price = listing_price;
            return this;
        }
        
        public Builder listing_quantity(final Long listing_quantity) {
            this.listing_quantity = listing_quantity;
            return this;
        }
        
        public Builder nft_status(final String nft_status) {
            this.nft_status = nft_status;
            return this;
        }
        
        public Builder page_index(final Long page_index) {
            this.page_index = page_index;
            return this;
        }
        
        public Builder preview_type(final String preview_type) {
            this.preview_type = preview_type;
            return this;
        }
        
        public void reset() {
            this.listing_id = null;
            this.group_id = null;
            this.item_id = null;
            this.item_name = null;
            this.item_token_id = null;
            this.item_token_contract_address = null;
            this.item_rarity = null;
            this.listing_price = null;
            this.listing_currency = null;
            this.listing_quantity = null;
            this.wallet_address = null;
            this.nft_status = null;
            this.link_type = null;
            this.link_url = null;
            this.preview_type = null;
            this.page_index = null;
            this.wallet_address_target_owner = null;
            this.error = null;
            this.claim_selection_count = null;
            this.config_shop_id = null;
            this.config_shop_header = null;
            this.config_shop_description = null;
            this.discover_category_name = null;
            this.shop_badge_name = null;
            this.shop_sticker_name = null;
            this.choice_id = null;
        }
        
        public Builder shop_badge_name(final String shop_badge_name) {
            this.shop_badge_name = shop_badge_name;
            return this;
        }
        
        public Builder shop_sticker_name(final String shop_sticker_name) {
            this.shop_sticker_name = shop_sticker_name;
            return this;
        }
        
        public Builder wallet_address(final String wallet_address) {
            this.wallet_address = wallet_address;
            return this;
        }
        
        public Builder wallet_address_target_owner(final String wallet_address_target_owner) {
            this.wallet_address_target_owner = wallet_address_target_owner;
            return this;
        }
    }
    
    public static final class MarketplaceAdapter implements a<Marketplace, Builder>
    {
        private MarketplaceAdapter() {
        }
        
        public Marketplace read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Marketplace read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.choice_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 11) {
                            builder.shop_sticker_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 11) {
                            builder.shop_badge_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 11) {
                            builder.discover_category_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 11) {
                            builder.config_shop_description(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 11) {
                            builder.config_shop_header(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 11) {
                            builder.config_shop_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 10) {
                            builder.claim_selection_count(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 11) {
                            builder.error(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 11) {
                            builder.wallet_address_target_owner(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 10) {
                            builder.page_index(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 11) {
                            builder.preview_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 11) {
                            builder.link_url(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.link_type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.nft_status(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.wallet_address(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 10) {
                            builder.listing_quantity(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.listing_currency(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.listing_price(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.item_rarity(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.item_token_contract_address(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.item_token_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.item_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.item_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.group_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.listing_id(e.F());
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
        
        public void write(final e e, final Marketplace marketplace) throws IOException {
            e.a0();
            if (marketplace.listing_id != null) {
                e.N(1, (byte)11);
                e.Z(marketplace.listing_id);
                e.O();
            }
            if (marketplace.group_id != null) {
                e.N(2, (byte)11);
                e.Z(marketplace.group_id);
                e.O();
            }
            if (marketplace.item_id != null) {
                e.N(3, (byte)11);
                e.Z(marketplace.item_id);
                e.O();
            }
            if (marketplace.item_name != null) {
                e.N(4, (byte)11);
                e.Z(marketplace.item_name);
                e.O();
            }
            if (marketplace.item_token_id != null) {
                e.N(5, (byte)11);
                e.Z(marketplace.item_token_id);
                e.O();
            }
            if (marketplace.item_token_contract_address != null) {
                e.N(6, (byte)11);
                e.Z(marketplace.item_token_contract_address);
                e.O();
            }
            if (marketplace.item_rarity != null) {
                e.N(7, (byte)11);
                e.Z(marketplace.item_rarity);
                e.O();
            }
            if (marketplace.listing_price != null) {
                e.N(8, (byte)10);
                a.r(marketplace.listing_price, e);
            }
            if (marketplace.listing_currency != null) {
                e.N(9, (byte)11);
                e.Z(marketplace.listing_currency);
                e.O();
            }
            if (marketplace.listing_quantity != null) {
                e.N(10, (byte)10);
                a.r(marketplace.listing_quantity, e);
            }
            if (marketplace.wallet_address != null) {
                e.N(11, (byte)11);
                e.Z(marketplace.wallet_address);
                e.O();
            }
            if (marketplace.nft_status != null) {
                e.N(12, (byte)11);
                e.Z(marketplace.nft_status);
                e.O();
            }
            if (marketplace.link_type != null) {
                e.N(13, (byte)11);
                e.Z(marketplace.link_type);
                e.O();
            }
            if (marketplace.link_url != null) {
                e.N(14, (byte)11);
                e.Z(marketplace.link_url);
                e.O();
            }
            if (marketplace.preview_type != null) {
                e.N(15, (byte)11);
                e.Z(marketplace.preview_type);
                e.O();
            }
            if (marketplace.page_index != null) {
                e.N(16, (byte)10);
                a.r(marketplace.page_index, e);
            }
            if (marketplace.wallet_address_target_owner != null) {
                e.N(17, (byte)11);
                e.Z(marketplace.wallet_address_target_owner);
                e.O();
            }
            if (marketplace.error != null) {
                e.N(18, (byte)11);
                e.Z(marketplace.error);
                e.O();
            }
            if (marketplace.claim_selection_count != null) {
                e.N(19, (byte)10);
                a.r(marketplace.claim_selection_count, e);
            }
            if (marketplace.config_shop_id != null) {
                e.N(20, (byte)11);
                e.Z(marketplace.config_shop_id);
                e.O();
            }
            if (marketplace.config_shop_header != null) {
                e.N(21, (byte)11);
                e.Z(marketplace.config_shop_header);
                e.O();
            }
            if (marketplace.config_shop_description != null) {
                e.N(22, (byte)11);
                e.Z(marketplace.config_shop_description);
                e.O();
            }
            if (marketplace.discover_category_name != null) {
                e.N(23, (byte)11);
                e.Z(marketplace.discover_category_name);
                e.O();
            }
            if (marketplace.shop_badge_name != null) {
                e.N(24, (byte)11);
                e.Z(marketplace.shop_badge_name);
                e.O();
            }
            if (marketplace.shop_sticker_name != null) {
                e.N(25, (byte)11);
                e.Z(marketplace.shop_sticker_name);
                e.O();
            }
            if (marketplace.choice_id != null) {
                e.N(26, (byte)11);
                e.Z(marketplace.choice_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
