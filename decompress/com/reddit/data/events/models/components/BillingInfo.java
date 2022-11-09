// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import jt.a;

public final class BillingInfo
{
    public static final a<BillingInfo, BillingInfo.BillingInfo$Builder> ADAPTER;
    public final Long available_freebies;
    public final Long balance;
    public final Long billing_threshold;
    public final Long credit;
    public final Long max_billing_threshold;
    public final Long spent_freebies;
    public final Long total_refund_pennies;
    
    static {
        ADAPTER = (a)new BillingInfo.BillingInfo$BillingInfoAdapter((BillingInfo$1)null);
    }
    
    private BillingInfo(final BillingInfo.BillingInfo$Builder billingInfo$Builder) {
        this.balance = BillingInfo.BillingInfo$Builder.access$100(billingInfo$Builder);
        this.billing_threshold = BillingInfo.BillingInfo$Builder.access$200(billingInfo$Builder);
        this.credit = BillingInfo.BillingInfo$Builder.access$300(billingInfo$Builder);
        this.max_billing_threshold = BillingInfo.BillingInfo$Builder.access$400(billingInfo$Builder);
        this.total_refund_pennies = BillingInfo.BillingInfo$Builder.access$500(billingInfo$Builder);
        this.available_freebies = BillingInfo.BillingInfo$Builder.access$600(billingInfo$Builder);
        this.spent_freebies = BillingInfo.BillingInfo$Builder.access$700(billingInfo$Builder);
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
        if (!(o instanceof BillingInfo)) {
            return false;
        }
        final BillingInfo billingInfo = (BillingInfo)o;
        final Long balance = this.balance;
        final Long balance2 = billingInfo.balance;
        if (balance == balance2 || (balance != null && balance.equals(balance2))) {
            final Long billing_threshold = this.billing_threshold;
            final Long billing_threshold2 = billingInfo.billing_threshold;
            if (billing_threshold == billing_threshold2 || (billing_threshold != null && billing_threshold.equals(billing_threshold2))) {
                final Long credit = this.credit;
                final Long credit2 = billingInfo.credit;
                if (credit == credit2 || (credit != null && credit.equals(credit2))) {
                    final Long max_billing_threshold = this.max_billing_threshold;
                    final Long max_billing_threshold2 = billingInfo.max_billing_threshold;
                    if (max_billing_threshold == max_billing_threshold2 || (max_billing_threshold != null && max_billing_threshold.equals(max_billing_threshold2))) {
                        final Long total_refund_pennies = this.total_refund_pennies;
                        final Long total_refund_pennies2 = billingInfo.total_refund_pennies;
                        if (total_refund_pennies == total_refund_pennies2 || (total_refund_pennies != null && total_refund_pennies.equals(total_refund_pennies2))) {
                            final Long available_freebies = this.available_freebies;
                            final Long available_freebies2 = billingInfo.available_freebies;
                            if (available_freebies == available_freebies2 || (available_freebies != null && available_freebies.equals(available_freebies2))) {
                                final Long spent_freebies = this.spent_freebies;
                                final Long spent_freebies2 = billingInfo.spent_freebies;
                                boolean b2 = b;
                                if (spent_freebies == spent_freebies2) {
                                    return b2;
                                }
                                if (spent_freebies != null && spent_freebies.equals(spent_freebies2)) {
                                    b2 = b;
                                    return b2;
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
        final Long balance = this.balance;
        int hashCode = 0;
        int hashCode2;
        if (balance == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = balance.hashCode();
        }
        final Long billing_threshold = this.billing_threshold;
        int hashCode3;
        if (billing_threshold == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = billing_threshold.hashCode();
        }
        final Long credit = this.credit;
        int hashCode4;
        if (credit == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = credit.hashCode();
        }
        final Long max_billing_threshold = this.max_billing_threshold;
        int hashCode5;
        if (max_billing_threshold == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = max_billing_threshold.hashCode();
        }
        final Long total_refund_pennies = this.total_refund_pennies;
        int hashCode6;
        if (total_refund_pennies == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = total_refund_pennies.hashCode();
        }
        final Long available_freebies = this.available_freebies;
        int hashCode7;
        if (available_freebies == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = available_freebies.hashCode();
        }
        final Long spent_freebies = this.spent_freebies;
        if (spent_freebies != null) {
            hashCode = spent_freebies.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("BillingInfo{balance=");
        k.append(this.balance);
        k.append(", billing_threshold=");
        k.append(this.billing_threshold);
        k.append(", credit=");
        k.append(this.credit);
        k.append(", max_billing_threshold=");
        k.append(this.max_billing_threshold);
        k.append(", total_refund_pennies=");
        k.append(this.total_refund_pennies);
        k.append(", available_freebies=");
        k.append(this.available_freebies);
        k.append(", spent_freebies=");
        return a.h(k, this.spent_freebies, "}");
    }
    
    public void write(final e e) throws IOException {
        BillingInfo.ADAPTER.write(e, (Object)this);
    }
}
