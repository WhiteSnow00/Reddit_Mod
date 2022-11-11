// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import ak0.n;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class Brand
{
    public static final a<Brand, Brand.Brand$Builder> ADAPTER;
    public final String account_type;
    public final String admin_approval;
    public final String attribution_type;
    public final String click_attribution_window;
    public final Long created_timestamp;
    public final String default_payment_profile_id;
    public final List<String> feature_flags;
    public final String id;
    public final Boolean pay_by_invoice;
    public final List<String> payment_profile_ids;
    public final String status;
    public final String view_attribution_window;
    
    static {
        ADAPTER = (a)new Brand.Brand$BrandAdapter((Brand$1)null);
    }
    
    private Brand(final Brand.Brand$Builder brand$Builder) {
        this.id = Brand.Brand$Builder.access$100(brand$Builder);
        this.status = Brand.Brand$Builder.access$200(brand$Builder);
        this.created_timestamp = Brand.Brand$Builder.access$300(brand$Builder);
        this.click_attribution_window = Brand.Brand$Builder.access$400(brand$Builder);
        this.view_attribution_window = Brand.Brand$Builder.access$500(brand$Builder);
        this.attribution_type = Brand.Brand$Builder.access$600(brand$Builder);
        this.default_payment_profile_id = Brand.Brand$Builder.access$700(brand$Builder);
        final List access$800 = Brand.Brand$Builder.access$800(brand$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$800 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Brand.Brand$Builder.access$800(brand$Builder));
        }
        this.payment_profile_ids = unmodifiableList;
        this.admin_approval = Brand.Brand$Builder.access$900(brand$Builder);
        this.account_type = Brand.Brand$Builder.access$1000(brand$Builder);
        this.pay_by_invoice = Brand.Brand$Builder.access$1100(brand$Builder);
        List<String> unmodifiableList2;
        if (Brand.Brand$Builder.access$1200(brand$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Brand.Brand$Builder.access$1200(brand$Builder));
        }
        this.feature_flags = unmodifiableList2;
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
        if (!(o instanceof Brand)) {
            return false;
        }
        final Brand brand = (Brand)o;
        final String id = this.id;
        final String id2 = brand.id;
        if (id == id2 || id.equals(id2)) {
            final String status = this.status;
            final String status2 = brand.status;
            if (status == status2 || (status != null && status.equals(status2))) {
                final Long created_timestamp = this.created_timestamp;
                final Long created_timestamp2 = brand.created_timestamp;
                if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                    final String click_attribution_window = this.click_attribution_window;
                    final String click_attribution_window2 = brand.click_attribution_window;
                    if (click_attribution_window == click_attribution_window2 || (click_attribution_window != null && click_attribution_window.equals(click_attribution_window2))) {
                        final String view_attribution_window = this.view_attribution_window;
                        final String view_attribution_window2 = brand.view_attribution_window;
                        if (view_attribution_window == view_attribution_window2 || (view_attribution_window != null && view_attribution_window.equals(view_attribution_window2))) {
                            final String attribution_type = this.attribution_type;
                            final String attribution_type2 = brand.attribution_type;
                            if (attribution_type == attribution_type2 || (attribution_type != null && attribution_type.equals(attribution_type2))) {
                                final String default_payment_profile_id = this.default_payment_profile_id;
                                final String default_payment_profile_id2 = brand.default_payment_profile_id;
                                if (default_payment_profile_id == default_payment_profile_id2 || (default_payment_profile_id != null && default_payment_profile_id.equals(default_payment_profile_id2))) {
                                    final List<String> payment_profile_ids = this.payment_profile_ids;
                                    final List<String> payment_profile_ids2 = brand.payment_profile_ids;
                                    if (payment_profile_ids == payment_profile_ids2 || (payment_profile_ids != null && payment_profile_ids.equals(payment_profile_ids2))) {
                                        final String admin_approval = this.admin_approval;
                                        final String admin_approval2 = brand.admin_approval;
                                        if (admin_approval == admin_approval2 || (admin_approval != null && admin_approval.equals(admin_approval2))) {
                                            final String account_type = this.account_type;
                                            final String account_type2 = brand.account_type;
                                            if (account_type == account_type2 || (account_type != null && account_type.equals(account_type2))) {
                                                final Boolean pay_by_invoice = this.pay_by_invoice;
                                                final Boolean pay_by_invoice2 = brand.pay_by_invoice;
                                                if (pay_by_invoice == pay_by_invoice2 || (pay_by_invoice != null && pay_by_invoice.equals(pay_by_invoice2))) {
                                                    final List<String> feature_flags = this.feature_flags;
                                                    final List<String> feature_flags2 = brand.feature_flags;
                                                    boolean b2 = b;
                                                    if (feature_flags == feature_flags2) {
                                                        return b2;
                                                    }
                                                    if (feature_flags != null && feature_flags.equals(feature_flags2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String status = this.status;
        int hashCode2 = 0;
        int hashCode3;
        if (status == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = status.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode4;
        if (created_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = created_timestamp.hashCode();
        }
        final String click_attribution_window = this.click_attribution_window;
        int hashCode5;
        if (click_attribution_window == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = click_attribution_window.hashCode();
        }
        final String view_attribution_window = this.view_attribution_window;
        int hashCode6;
        if (view_attribution_window == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = view_attribution_window.hashCode();
        }
        final String attribution_type = this.attribution_type;
        int hashCode7;
        if (attribution_type == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = attribution_type.hashCode();
        }
        final String default_payment_profile_id = this.default_payment_profile_id;
        int hashCode8;
        if (default_payment_profile_id == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = default_payment_profile_id.hashCode();
        }
        final List<String> payment_profile_ids = this.payment_profile_ids;
        int hashCode9;
        if (payment_profile_ids == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = payment_profile_ids.hashCode();
        }
        final String admin_approval = this.admin_approval;
        int hashCode10;
        if (admin_approval == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = admin_approval.hashCode();
        }
        final String account_type = this.account_type;
        int hashCode11;
        if (account_type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = account_type.hashCode();
        }
        final Boolean pay_by_invoice = this.pay_by_invoice;
        int hashCode12;
        if (pay_by_invoice == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = pay_by_invoice.hashCode();
        }
        final List<String> feature_flags = this.feature_flags;
        if (feature_flags != null) {
            hashCode2 = feature_flags.hashCode();
        }
        return ((((((((((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Brand{id=");
        k.append(this.id);
        k.append(", status=");
        k.append(this.status);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", click_attribution_window=");
        k.append(this.click_attribution_window);
        k.append(", view_attribution_window=");
        k.append(this.view_attribution_window);
        k.append(", attribution_type=");
        k.append(this.attribution_type);
        k.append(", default_payment_profile_id=");
        k.append(this.default_payment_profile_id);
        k.append(", payment_profile_ids=");
        k.append(this.payment_profile_ids);
        k.append(", admin_approval=");
        k.append(this.admin_approval);
        k.append(", account_type=");
        k.append(this.account_type);
        k.append(", pay_by_invoice=");
        k.append(this.pay_by_invoice);
        k.append(", feature_flags=");
        return n.r(k, (List)this.feature_flags, "}");
    }
    
    public void write(final e e) throws IOException {
        Brand.ADAPTER.write(e, (Object)this);
    }
}
