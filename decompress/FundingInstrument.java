// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class FundingInstrument
{
    public static final a<FundingInstrument, Builder> ADAPTER;
    public final Boolean active;
    public final String admin_id;
    public final Long adzerk_lifetime_micros;
    public final String authorize_payment_profile_id;
    public final String authorize_profile_id;
    public final Long available_freebies_micros;
    public final Long balance_micros;
    public final Long billing_threshold_micros;
    public final Long created_timestamp;
    public final Long credit_line_micros;
    public final Long end_timestamp;
    public final Long estimated_spending_micros;
    public final Long id;
    public final Boolean is_effective;
    public final Long last_modified_timestamp;
    public final String legacy_transaction_id;
    public final String level;
    public final String line_item_id;
    public final Long max_billing_threshold_micros;
    public final String name;
    public final String netsuite_customer_internal_id;
    public final String original_payment_id;
    public final Long overdelivery_micros;
    public final Boolean overwrite;
    public final String payment_id;
    public final Long rollup_timestamp;
    public final Boolean servable;
    public final Long spent_freebies_micros;
    public final Long start_timestamp;
    public final String timezone;
    public final Long total_payment_micros;
    public final Long total_refund_micros;
    public final Long total_spending_micros;
    public final String type;
    public final String user_id;
    public final Long writeoff_micros;
    
    static {
        ADAPTER = (a)new FundingInstrumentAdapter(null);
    }
    
    private FundingInstrument(final Builder builder) {
        this.id = Builder.access$100(builder);
        this.created_timestamp = Builder.access$200(builder);
        this.last_modified_timestamp = Builder.access$300(builder);
        this.user_id = Builder.access$400(builder);
        this.type = Builder.access$500(builder);
        this.start_timestamp = Builder.access$600(builder);
        this.end_timestamp = Builder.access$700(builder);
        this.name = Builder.access$800(builder);
        this.line_item_id = Builder.access$900(builder);
        this.authorize_payment_profile_id = Builder.access$1000(builder);
        this.authorize_profile_id = Builder.access$1100(builder);
        this.servable = Builder.access$1200(builder);
        this.admin_id = Builder.access$1300(builder);
        this.credit_line_micros = Builder.access$1400(builder);
        this.balance_micros = Builder.access$1500(builder);
        this.billing_threshold_micros = Builder.access$1600(builder);
        this.total_spending_micros = Builder.access$1700(builder);
        this.total_payment_micros = Builder.access$1800(builder);
        this.spent_freebies_micros = Builder.access$1900(builder);
        this.available_freebies_micros = Builder.access$2000(builder);
        this.overdelivery_micros = Builder.access$2100(builder);
        this.total_refund_micros = Builder.access$2200(builder);
        this.overwrite = Builder.access$2300(builder);
        this.payment_id = Builder.access$2400(builder);
        this.original_payment_id = Builder.access$2500(builder);
        this.legacy_transaction_id = Builder.access$2600(builder);
        this.active = Builder.access$2700(builder);
        this.is_effective = Builder.access$2800(builder);
        this.level = Builder.access$2900(builder);
        this.netsuite_customer_internal_id = Builder.access$3000(builder);
        this.max_billing_threshold_micros = Builder.access$3100(builder);
        this.estimated_spending_micros = Builder.access$3200(builder);
        this.writeoff_micros = Builder.access$3300(builder);
        this.adzerk_lifetime_micros = Builder.access$3400(builder);
        this.rollup_timestamp = Builder.access$3500(builder);
        this.timezone = Builder.access$3600(builder);
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
        if (!(o instanceof FundingInstrument)) {
            return false;
        }
        final FundingInstrument fundingInstrument = (FundingInstrument)o;
        final Long id = this.id;
        final Long id2 = fundingInstrument.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long created_timestamp = this.created_timestamp;
            final Long created_timestamp2 = fundingInstrument.created_timestamp;
            if (created_timestamp == created_timestamp2 || (created_timestamp != null && created_timestamp.equals(created_timestamp2))) {
                final Long last_modified_timestamp = this.last_modified_timestamp;
                final Long last_modified_timestamp2 = fundingInstrument.last_modified_timestamp;
                if (last_modified_timestamp == last_modified_timestamp2 || (last_modified_timestamp != null && last_modified_timestamp.equals(last_modified_timestamp2))) {
                    final String user_id = this.user_id;
                    final String user_id2 = fundingInstrument.user_id;
                    if (user_id == user_id2 || (user_id != null && user_id.equals(user_id2))) {
                        final String type = this.type;
                        final String type2 = fundingInstrument.type;
                        if (type == type2 || (type != null && type.equals(type2))) {
                            final Long start_timestamp = this.start_timestamp;
                            final Long start_timestamp2 = fundingInstrument.start_timestamp;
                            if (start_timestamp == start_timestamp2 || (start_timestamp != null && start_timestamp.equals(start_timestamp2))) {
                                final Long end_timestamp = this.end_timestamp;
                                final Long end_timestamp2 = fundingInstrument.end_timestamp;
                                if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                                    final String name = this.name;
                                    final String name2 = fundingInstrument.name;
                                    if (name == name2 || (name != null && name.equals(name2))) {
                                        final String line_item_id = this.line_item_id;
                                        final String line_item_id2 = fundingInstrument.line_item_id;
                                        if (line_item_id == line_item_id2 || (line_item_id != null && line_item_id.equals(line_item_id2))) {
                                            final String authorize_payment_profile_id = this.authorize_payment_profile_id;
                                            final String authorize_payment_profile_id2 = fundingInstrument.authorize_payment_profile_id;
                                            if (authorize_payment_profile_id == authorize_payment_profile_id2 || (authorize_payment_profile_id != null && authorize_payment_profile_id.equals(authorize_payment_profile_id2))) {
                                                final String authorize_profile_id = this.authorize_profile_id;
                                                final String authorize_profile_id2 = fundingInstrument.authorize_profile_id;
                                                if (authorize_profile_id == authorize_profile_id2 || (authorize_profile_id != null && authorize_profile_id.equals(authorize_profile_id2))) {
                                                    final Boolean servable = this.servable;
                                                    final Boolean servable2 = fundingInstrument.servable;
                                                    if (servable == servable2 || (servable != null && servable.equals(servable2))) {
                                                        final String admin_id = this.admin_id;
                                                        final String admin_id2 = fundingInstrument.admin_id;
                                                        if (admin_id == admin_id2 || (admin_id != null && admin_id.equals(admin_id2))) {
                                                            final Long credit_line_micros = this.credit_line_micros;
                                                            final Long credit_line_micros2 = fundingInstrument.credit_line_micros;
                                                            if (credit_line_micros == credit_line_micros2 || (credit_line_micros != null && credit_line_micros.equals(credit_line_micros2))) {
                                                                final Long balance_micros = this.balance_micros;
                                                                final Long balance_micros2 = fundingInstrument.balance_micros;
                                                                if (balance_micros == balance_micros2 || (balance_micros != null && balance_micros.equals(balance_micros2))) {
                                                                    final Long billing_threshold_micros = this.billing_threshold_micros;
                                                                    final Long billing_threshold_micros2 = fundingInstrument.billing_threshold_micros;
                                                                    if (billing_threshold_micros == billing_threshold_micros2 || (billing_threshold_micros != null && billing_threshold_micros.equals(billing_threshold_micros2))) {
                                                                        final Long total_spending_micros = this.total_spending_micros;
                                                                        final Long total_spending_micros2 = fundingInstrument.total_spending_micros;
                                                                        if (total_spending_micros == total_spending_micros2 || (total_spending_micros != null && total_spending_micros.equals(total_spending_micros2))) {
                                                                            final Long total_payment_micros = this.total_payment_micros;
                                                                            final Long total_payment_micros2 = fundingInstrument.total_payment_micros;
                                                                            if (total_payment_micros == total_payment_micros2 || (total_payment_micros != null && total_payment_micros.equals(total_payment_micros2))) {
                                                                                final Long spent_freebies_micros = this.spent_freebies_micros;
                                                                                final Long spent_freebies_micros2 = fundingInstrument.spent_freebies_micros;
                                                                                if (spent_freebies_micros == spent_freebies_micros2 || (spent_freebies_micros != null && spent_freebies_micros.equals(spent_freebies_micros2))) {
                                                                                    final Long available_freebies_micros = this.available_freebies_micros;
                                                                                    final Long available_freebies_micros2 = fundingInstrument.available_freebies_micros;
                                                                                    if (available_freebies_micros == available_freebies_micros2 || (available_freebies_micros != null && available_freebies_micros.equals(available_freebies_micros2))) {
                                                                                        final Long overdelivery_micros = this.overdelivery_micros;
                                                                                        final Long overdelivery_micros2 = fundingInstrument.overdelivery_micros;
                                                                                        if (overdelivery_micros == overdelivery_micros2 || (overdelivery_micros != null && overdelivery_micros.equals(overdelivery_micros2))) {
                                                                                            final Long total_refund_micros = this.total_refund_micros;
                                                                                            final Long total_refund_micros2 = fundingInstrument.total_refund_micros;
                                                                                            if (total_refund_micros == total_refund_micros2 || (total_refund_micros != null && total_refund_micros.equals(total_refund_micros2))) {
                                                                                                final Boolean overwrite = this.overwrite;
                                                                                                final Boolean overwrite2 = fundingInstrument.overwrite;
                                                                                                if (overwrite == overwrite2 || (overwrite != null && overwrite.equals(overwrite2))) {
                                                                                                    final String payment_id = this.payment_id;
                                                                                                    final String payment_id2 = fundingInstrument.payment_id;
                                                                                                    if (payment_id == payment_id2 || (payment_id != null && payment_id.equals(payment_id2))) {
                                                                                                        final String original_payment_id = this.original_payment_id;
                                                                                                        final String original_payment_id2 = fundingInstrument.original_payment_id;
                                                                                                        if (original_payment_id == original_payment_id2 || (original_payment_id != null && original_payment_id.equals(original_payment_id2))) {
                                                                                                            final String legacy_transaction_id = this.legacy_transaction_id;
                                                                                                            final String legacy_transaction_id2 = fundingInstrument.legacy_transaction_id;
                                                                                                            if (legacy_transaction_id == legacy_transaction_id2 || (legacy_transaction_id != null && legacy_transaction_id.equals(legacy_transaction_id2))) {
                                                                                                                final Boolean active = this.active;
                                                                                                                final Boolean active2 = fundingInstrument.active;
                                                                                                                if (active == active2 || (active != null && active.equals(active2))) {
                                                                                                                    final Boolean is_effective = this.is_effective;
                                                                                                                    final Boolean is_effective2 = fundingInstrument.is_effective;
                                                                                                                    if (is_effective == is_effective2 || (is_effective != null && is_effective.equals(is_effective2))) {
                                                                                                                        final String level = this.level;
                                                                                                                        final String level2 = fundingInstrument.level;
                                                                                                                        if (level == level2 || (level != null && level.equals(level2))) {
                                                                                                                            final String netsuite_customer_internal_id = this.netsuite_customer_internal_id;
                                                                                                                            final String netsuite_customer_internal_id2 = fundingInstrument.netsuite_customer_internal_id;
                                                                                                                            if (netsuite_customer_internal_id == netsuite_customer_internal_id2 || (netsuite_customer_internal_id != null && netsuite_customer_internal_id.equals(netsuite_customer_internal_id2))) {
                                                                                                                                final Long max_billing_threshold_micros = this.max_billing_threshold_micros;
                                                                                                                                final Long max_billing_threshold_micros2 = fundingInstrument.max_billing_threshold_micros;
                                                                                                                                if (max_billing_threshold_micros == max_billing_threshold_micros2 || (max_billing_threshold_micros != null && max_billing_threshold_micros.equals(max_billing_threshold_micros2))) {
                                                                                                                                    final Long estimated_spending_micros = this.estimated_spending_micros;
                                                                                                                                    final Long estimated_spending_micros2 = fundingInstrument.estimated_spending_micros;
                                                                                                                                    if (estimated_spending_micros == estimated_spending_micros2 || (estimated_spending_micros != null && estimated_spending_micros.equals(estimated_spending_micros2))) {
                                                                                                                                        final Long writeoff_micros = this.writeoff_micros;
                                                                                                                                        final Long writeoff_micros2 = fundingInstrument.writeoff_micros;
                                                                                                                                        if (writeoff_micros == writeoff_micros2 || (writeoff_micros != null && writeoff_micros.equals(writeoff_micros2))) {
                                                                                                                                            final Long adzerk_lifetime_micros = this.adzerk_lifetime_micros;
                                                                                                                                            final Long adzerk_lifetime_micros2 = fundingInstrument.adzerk_lifetime_micros;
                                                                                                                                            if (adzerk_lifetime_micros == adzerk_lifetime_micros2 || (adzerk_lifetime_micros != null && adzerk_lifetime_micros.equals(adzerk_lifetime_micros2))) {
                                                                                                                                                final Long rollup_timestamp = this.rollup_timestamp;
                                                                                                                                                final Long rollup_timestamp2 = fundingInstrument.rollup_timestamp;
                                                                                                                                                if (rollup_timestamp == rollup_timestamp2 || (rollup_timestamp != null && rollup_timestamp.equals(rollup_timestamp2))) {
                                                                                                                                                    final String timezone = this.timezone;
                                                                                                                                                    final String timezone2 = fundingInstrument.timezone;
                                                                                                                                                    boolean b2 = b;
                                                                                                                                                    if (timezone == timezone2) {
                                                                                                                                                        return b2;
                                                                                                                                                    }
                                                                                                                                                    if (timezone != null && timezone.equals(timezone2)) {
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
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Long created_timestamp = this.created_timestamp;
        int hashCode3;
        if (created_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = created_timestamp.hashCode();
        }
        final Long last_modified_timestamp = this.last_modified_timestamp;
        int hashCode4;
        if (last_modified_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = last_modified_timestamp.hashCode();
        }
        final String user_id = this.user_id;
        int hashCode5;
        if (user_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = user_id.hashCode();
        }
        final String type = this.type;
        int hashCode6;
        if (type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = type.hashCode();
        }
        final Long start_timestamp = this.start_timestamp;
        int hashCode7;
        if (start_timestamp == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = start_timestamp.hashCode();
        }
        final Long end_timestamp = this.end_timestamp;
        int hashCode8;
        if (end_timestamp == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = end_timestamp.hashCode();
        }
        final String name = this.name;
        int hashCode9;
        if (name == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = name.hashCode();
        }
        final String line_item_id = this.line_item_id;
        int hashCode10;
        if (line_item_id == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = line_item_id.hashCode();
        }
        final String authorize_payment_profile_id = this.authorize_payment_profile_id;
        int hashCode11;
        if (authorize_payment_profile_id == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = authorize_payment_profile_id.hashCode();
        }
        final String authorize_profile_id = this.authorize_profile_id;
        int hashCode12;
        if (authorize_profile_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = authorize_profile_id.hashCode();
        }
        final Boolean servable = this.servable;
        int hashCode13;
        if (servable == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = servable.hashCode();
        }
        final String admin_id = this.admin_id;
        int hashCode14;
        if (admin_id == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = admin_id.hashCode();
        }
        final Long credit_line_micros = this.credit_line_micros;
        int hashCode15;
        if (credit_line_micros == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = credit_line_micros.hashCode();
        }
        final Long balance_micros = this.balance_micros;
        int hashCode16;
        if (balance_micros == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = balance_micros.hashCode();
        }
        final Long billing_threshold_micros = this.billing_threshold_micros;
        int hashCode17;
        if (billing_threshold_micros == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = billing_threshold_micros.hashCode();
        }
        final Long total_spending_micros = this.total_spending_micros;
        int hashCode18;
        if (total_spending_micros == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = total_spending_micros.hashCode();
        }
        final Long total_payment_micros = this.total_payment_micros;
        int hashCode19;
        if (total_payment_micros == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = total_payment_micros.hashCode();
        }
        final Long spent_freebies_micros = this.spent_freebies_micros;
        int hashCode20;
        if (spent_freebies_micros == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = spent_freebies_micros.hashCode();
        }
        final Long available_freebies_micros = this.available_freebies_micros;
        int hashCode21;
        if (available_freebies_micros == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = available_freebies_micros.hashCode();
        }
        final Long overdelivery_micros = this.overdelivery_micros;
        int hashCode22;
        if (overdelivery_micros == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = overdelivery_micros.hashCode();
        }
        final Long total_refund_micros = this.total_refund_micros;
        int hashCode23;
        if (total_refund_micros == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = total_refund_micros.hashCode();
        }
        final Boolean overwrite = this.overwrite;
        int hashCode24;
        if (overwrite == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = overwrite.hashCode();
        }
        final String payment_id = this.payment_id;
        int hashCode25;
        if (payment_id == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = payment_id.hashCode();
        }
        final String original_payment_id = this.original_payment_id;
        int hashCode26;
        if (original_payment_id == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = original_payment_id.hashCode();
        }
        final String legacy_transaction_id = this.legacy_transaction_id;
        int hashCode27;
        if (legacy_transaction_id == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = legacy_transaction_id.hashCode();
        }
        final Boolean active = this.active;
        int hashCode28;
        if (active == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = active.hashCode();
        }
        final Boolean is_effective = this.is_effective;
        int hashCode29;
        if (is_effective == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = is_effective.hashCode();
        }
        final String level = this.level;
        int hashCode30;
        if (level == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = level.hashCode();
        }
        final String netsuite_customer_internal_id = this.netsuite_customer_internal_id;
        int hashCode31;
        if (netsuite_customer_internal_id == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = netsuite_customer_internal_id.hashCode();
        }
        final Long max_billing_threshold_micros = this.max_billing_threshold_micros;
        int hashCode32;
        if (max_billing_threshold_micros == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = max_billing_threshold_micros.hashCode();
        }
        final Long estimated_spending_micros = this.estimated_spending_micros;
        int hashCode33;
        if (estimated_spending_micros == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = estimated_spending_micros.hashCode();
        }
        final Long writeoff_micros = this.writeoff_micros;
        int hashCode34;
        if (writeoff_micros == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = writeoff_micros.hashCode();
        }
        final Long adzerk_lifetime_micros = this.adzerk_lifetime_micros;
        int hashCode35;
        if (adzerk_lifetime_micros == null) {
            hashCode35 = 0;
        }
        else {
            hashCode35 = adzerk_lifetime_micros.hashCode();
        }
        final Long rollup_timestamp = this.rollup_timestamp;
        int hashCode36;
        if (rollup_timestamp == null) {
            hashCode36 = 0;
        }
        else {
            hashCode36 = rollup_timestamp.hashCode();
        }
        final String timezone = this.timezone;
        if (timezone != null) {
            hashCode = timezone.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode34) * -2128831035 ^ hashCode35) * -2128831035 ^ hashCode36) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FundingInstrument{id=");
        k.append(this.id);
        k.append(", created_timestamp=");
        k.append(this.created_timestamp);
        k.append(", last_modified_timestamp=");
        k.append(this.last_modified_timestamp);
        k.append(", user_id=");
        k.append(this.user_id);
        k.append(", type=");
        k.append(this.type);
        k.append(", start_timestamp=");
        k.append(this.start_timestamp);
        k.append(", end_timestamp=");
        k.append(this.end_timestamp);
        k.append(", name=");
        k.append(this.name);
        k.append(", line_item_id=");
        k.append(this.line_item_id);
        k.append(", authorize_payment_profile_id=");
        k.append(this.authorize_payment_profile_id);
        k.append(", authorize_profile_id=");
        k.append(this.authorize_profile_id);
        k.append(", servable=");
        k.append(this.servable);
        k.append(", admin_id=");
        k.append(this.admin_id);
        k.append(", credit_line_micros=");
        k.append(this.credit_line_micros);
        k.append(", balance_micros=");
        k.append(this.balance_micros);
        k.append(", billing_threshold_micros=");
        k.append(this.billing_threshold_micros);
        k.append(", total_spending_micros=");
        k.append(this.total_spending_micros);
        k.append(", total_payment_micros=");
        k.append(this.total_payment_micros);
        k.append(", spent_freebies_micros=");
        k.append(this.spent_freebies_micros);
        k.append(", available_freebies_micros=");
        k.append(this.available_freebies_micros);
        k.append(", overdelivery_micros=");
        k.append(this.overdelivery_micros);
        k.append(", total_refund_micros=");
        k.append(this.total_refund_micros);
        k.append(", overwrite=");
        k.append(this.overwrite);
        k.append(", payment_id=");
        k.append(this.payment_id);
        k.append(", original_payment_id=");
        k.append(this.original_payment_id);
        k.append(", legacy_transaction_id=");
        k.append(this.legacy_transaction_id);
        k.append(", active=");
        k.append(this.active);
        k.append(", is_effective=");
        k.append(this.is_effective);
        k.append(", level=");
        k.append(this.level);
        k.append(", netsuite_customer_internal_id=");
        k.append(this.netsuite_customer_internal_id);
        k.append(", max_billing_threshold_micros=");
        k.append(this.max_billing_threshold_micros);
        k.append(", estimated_spending_micros=");
        k.append(this.estimated_spending_micros);
        k.append(", writeoff_micros=");
        k.append(this.writeoff_micros);
        k.append(", adzerk_lifetime_micros=");
        k.append(this.adzerk_lifetime_micros);
        k.append(", rollup_timestamp=");
        k.append(this.rollup_timestamp);
        k.append(", timezone=");
        return b.j(k, this.timezone, "}");
    }
    
    public void write(final e e) throws IOException {
        FundingInstrument.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<FundingInstrument>
    {
        private Boolean active;
        private String admin_id;
        private Long adzerk_lifetime_micros;
        private String authorize_payment_profile_id;
        private String authorize_profile_id;
        private Long available_freebies_micros;
        private Long balance_micros;
        private Long billing_threshold_micros;
        private Long created_timestamp;
        private Long credit_line_micros;
        private Long end_timestamp;
        private Long estimated_spending_micros;
        private Long id;
        private Boolean is_effective;
        private Long last_modified_timestamp;
        private String legacy_transaction_id;
        private String level;
        private String line_item_id;
        private Long max_billing_threshold_micros;
        private String name;
        private String netsuite_customer_internal_id;
        private String original_payment_id;
        private Long overdelivery_micros;
        private Boolean overwrite;
        private String payment_id;
        private Long rollup_timestamp;
        private Boolean servable;
        private Long spent_freebies_micros;
        private Long start_timestamp;
        private String timezone;
        private Long total_payment_micros;
        private Long total_refund_micros;
        private Long total_spending_micros;
        private String type;
        private String user_id;
        private Long writeoff_micros;
        
        public Builder() {
        }
        
        public Builder(final FundingInstrument fundingInstrument) {
            this.id = fundingInstrument.id;
            this.created_timestamp = fundingInstrument.created_timestamp;
            this.last_modified_timestamp = fundingInstrument.last_modified_timestamp;
            this.user_id = fundingInstrument.user_id;
            this.type = fundingInstrument.type;
            this.start_timestamp = fundingInstrument.start_timestamp;
            this.end_timestamp = fundingInstrument.end_timestamp;
            this.name = fundingInstrument.name;
            this.line_item_id = fundingInstrument.line_item_id;
            this.authorize_payment_profile_id = fundingInstrument.authorize_payment_profile_id;
            this.authorize_profile_id = fundingInstrument.authorize_profile_id;
            this.servable = fundingInstrument.servable;
            this.admin_id = fundingInstrument.admin_id;
            this.credit_line_micros = fundingInstrument.credit_line_micros;
            this.balance_micros = fundingInstrument.balance_micros;
            this.billing_threshold_micros = fundingInstrument.billing_threshold_micros;
            this.total_spending_micros = fundingInstrument.total_spending_micros;
            this.total_payment_micros = fundingInstrument.total_payment_micros;
            this.spent_freebies_micros = fundingInstrument.spent_freebies_micros;
            this.available_freebies_micros = fundingInstrument.available_freebies_micros;
            this.overdelivery_micros = fundingInstrument.overdelivery_micros;
            this.total_refund_micros = fundingInstrument.total_refund_micros;
            this.overwrite = fundingInstrument.overwrite;
            this.payment_id = fundingInstrument.payment_id;
            this.original_payment_id = fundingInstrument.original_payment_id;
            this.legacy_transaction_id = fundingInstrument.legacy_transaction_id;
            this.active = fundingInstrument.active;
            this.is_effective = fundingInstrument.is_effective;
            this.level = fundingInstrument.level;
            this.netsuite_customer_internal_id = fundingInstrument.netsuite_customer_internal_id;
            this.max_billing_threshold_micros = fundingInstrument.max_billing_threshold_micros;
            this.estimated_spending_micros = fundingInstrument.estimated_spending_micros;
            this.writeoff_micros = fundingInstrument.writeoff_micros;
            this.adzerk_lifetime_micros = fundingInstrument.adzerk_lifetime_micros;
            this.rollup_timestamp = fundingInstrument.rollup_timestamp;
            this.timezone = fundingInstrument.timezone;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.id;
        }
        
        public static /* synthetic */ String access$1000(final Builder builder) {
            return builder.authorize_payment_profile_id;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.authorize_profile_id;
        }
        
        public static /* synthetic */ Boolean access$1200(final Builder builder) {
            return builder.servable;
        }
        
        public static /* synthetic */ String access$1300(final Builder builder) {
            return builder.admin_id;
        }
        
        public static /* synthetic */ Long access$1400(final Builder builder) {
            return builder.credit_line_micros;
        }
        
        public static /* synthetic */ Long access$1500(final Builder builder) {
            return builder.balance_micros;
        }
        
        public static /* synthetic */ Long access$1600(final Builder builder) {
            return builder.billing_threshold_micros;
        }
        
        public static /* synthetic */ Long access$1700(final Builder builder) {
            return builder.total_spending_micros;
        }
        
        public static /* synthetic */ Long access$1800(final Builder builder) {
            return builder.total_payment_micros;
        }
        
        public static /* synthetic */ Long access$1900(final Builder builder) {
            return builder.spent_freebies_micros;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.created_timestamp;
        }
        
        public static /* synthetic */ Long access$2000(final Builder builder) {
            return builder.available_freebies_micros;
        }
        
        public static /* synthetic */ Long access$2100(final Builder builder) {
            return builder.overdelivery_micros;
        }
        
        public static /* synthetic */ Long access$2200(final Builder builder) {
            return builder.total_refund_micros;
        }
        
        public static /* synthetic */ Boolean access$2300(final Builder builder) {
            return builder.overwrite;
        }
        
        public static /* synthetic */ String access$2400(final Builder builder) {
            return builder.payment_id;
        }
        
        public static /* synthetic */ String access$2500(final Builder builder) {
            return builder.original_payment_id;
        }
        
        public static /* synthetic */ String access$2600(final Builder builder) {
            return builder.legacy_transaction_id;
        }
        
        public static /* synthetic */ Boolean access$2700(final Builder builder) {
            return builder.active;
        }
        
        public static /* synthetic */ Boolean access$2800(final Builder builder) {
            return builder.is_effective;
        }
        
        public static /* synthetic */ String access$2900(final Builder builder) {
            return builder.level;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.last_modified_timestamp;
        }
        
        public static /* synthetic */ String access$3000(final Builder builder) {
            return builder.netsuite_customer_internal_id;
        }
        
        public static /* synthetic */ Long access$3100(final Builder builder) {
            return builder.max_billing_threshold_micros;
        }
        
        public static /* synthetic */ Long access$3200(final Builder builder) {
            return builder.estimated_spending_micros;
        }
        
        public static /* synthetic */ Long access$3300(final Builder builder) {
            return builder.writeoff_micros;
        }
        
        public static /* synthetic */ Long access$3400(final Builder builder) {
            return builder.adzerk_lifetime_micros;
        }
        
        public static /* synthetic */ Long access$3500(final Builder builder) {
            return builder.rollup_timestamp;
        }
        
        public static /* synthetic */ String access$3600(final Builder builder) {
            return builder.timezone;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.user_id;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.start_timestamp;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.end_timestamp;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.name;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.line_item_id;
        }
        
        public Builder active(final Boolean active) {
            this.active = active;
            return this;
        }
        
        public Builder admin_id(final String admin_id) {
            this.admin_id = admin_id;
            return this;
        }
        
        public Builder adzerk_lifetime_micros(final Long adzerk_lifetime_micros) {
            this.adzerk_lifetime_micros = adzerk_lifetime_micros;
            return this;
        }
        
        public Builder authorize_payment_profile_id(final String authorize_payment_profile_id) {
            this.authorize_payment_profile_id = authorize_payment_profile_id;
            return this;
        }
        
        public Builder authorize_profile_id(final String authorize_profile_id) {
            this.authorize_profile_id = authorize_profile_id;
            return this;
        }
        
        public Builder available_freebies_micros(final Long available_freebies_micros) {
            this.available_freebies_micros = available_freebies_micros;
            return this;
        }
        
        public Builder balance_micros(final Long balance_micros) {
            this.balance_micros = balance_micros;
            return this;
        }
        
        public Builder billing_threshold_micros(final Long billing_threshold_micros) {
            this.billing_threshold_micros = billing_threshold_micros;
            return this;
        }
        
        public FundingInstrument build() {
            return new FundingInstrument(this, null);
        }
        
        public Builder created_timestamp(final Long created_timestamp) {
            this.created_timestamp = created_timestamp;
            return this;
        }
        
        public Builder credit_line_micros(final Long credit_line_micros) {
            this.credit_line_micros = credit_line_micros;
            return this;
        }
        
        public Builder end_timestamp(final Long end_timestamp) {
            this.end_timestamp = end_timestamp;
            return this;
        }
        
        public Builder estimated_spending_micros(final Long estimated_spending_micros) {
            this.estimated_spending_micros = estimated_spending_micros;
            return this;
        }
        
        public Builder id(final Long id) {
            this.id = id;
            return this;
        }
        
        public Builder is_effective(final Boolean is_effective) {
            this.is_effective = is_effective;
            return this;
        }
        
        public Builder last_modified_timestamp(final Long last_modified_timestamp) {
            this.last_modified_timestamp = last_modified_timestamp;
            return this;
        }
        
        public Builder legacy_transaction_id(final String legacy_transaction_id) {
            this.legacy_transaction_id = legacy_transaction_id;
            return this;
        }
        
        public Builder level(final String level) {
            this.level = level;
            return this;
        }
        
        public Builder line_item_id(final String line_item_id) {
            this.line_item_id = line_item_id;
            return this;
        }
        
        public Builder max_billing_threshold_micros(final Long max_billing_threshold_micros) {
            this.max_billing_threshold_micros = max_billing_threshold_micros;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder netsuite_customer_internal_id(final String netsuite_customer_internal_id) {
            this.netsuite_customer_internal_id = netsuite_customer_internal_id;
            return this;
        }
        
        public Builder original_payment_id(final String original_payment_id) {
            this.original_payment_id = original_payment_id;
            return this;
        }
        
        public Builder overdelivery_micros(final Long overdelivery_micros) {
            this.overdelivery_micros = overdelivery_micros;
            return this;
        }
        
        public Builder overwrite(final Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        
        public Builder payment_id(final String payment_id) {
            this.payment_id = payment_id;
            return this;
        }
        
        public void reset() {
            this.id = null;
            this.created_timestamp = null;
            this.last_modified_timestamp = null;
            this.user_id = null;
            this.type = null;
            this.start_timestamp = null;
            this.end_timestamp = null;
            this.name = null;
            this.line_item_id = null;
            this.authorize_payment_profile_id = null;
            this.authorize_profile_id = null;
            this.servable = null;
            this.admin_id = null;
            this.credit_line_micros = null;
            this.balance_micros = null;
            this.billing_threshold_micros = null;
            this.total_spending_micros = null;
            this.total_payment_micros = null;
            this.spent_freebies_micros = null;
            this.available_freebies_micros = null;
            this.overdelivery_micros = null;
            this.total_refund_micros = null;
            this.overwrite = null;
            this.payment_id = null;
            this.original_payment_id = null;
            this.legacy_transaction_id = null;
            this.active = null;
            this.is_effective = null;
            this.level = null;
            this.netsuite_customer_internal_id = null;
            this.max_billing_threshold_micros = null;
            this.estimated_spending_micros = null;
            this.writeoff_micros = null;
            this.adzerk_lifetime_micros = null;
            this.rollup_timestamp = null;
            this.timezone = null;
        }
        
        public Builder rollup_timestamp(final Long rollup_timestamp) {
            this.rollup_timestamp = rollup_timestamp;
            return this;
        }
        
        public Builder servable(final Boolean servable) {
            this.servable = servable;
            return this;
        }
        
        public Builder spent_freebies_micros(final Long spent_freebies_micros) {
            this.spent_freebies_micros = spent_freebies_micros;
            return this;
        }
        
        public Builder start_timestamp(final Long start_timestamp) {
            this.start_timestamp = start_timestamp;
            return this;
        }
        
        public Builder timezone(final String timezone) {
            this.timezone = timezone;
            return this;
        }
        
        public Builder total_payment_micros(final Long total_payment_micros) {
            this.total_payment_micros = total_payment_micros;
            return this;
        }
        
        public Builder total_refund_micros(final Long total_refund_micros) {
            this.total_refund_micros = total_refund_micros;
            return this;
        }
        
        public Builder total_spending_micros(final Long total_spending_micros) {
            this.total_spending_micros = total_spending_micros;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
        
        public Builder user_id(final String user_id) {
            this.user_id = user_id;
            return this;
        }
        
        public Builder writeoff_micros(final Long writeoff_micros) {
            this.writeoff_micros = writeoff_micros;
            return this;
        }
    }
    
    public static final class FundingInstrumentAdapter implements a<FundingInstrument, Builder>
    {
        private FundingInstrumentAdapter() {
        }
        
        public FundingInstrument read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public FundingInstrument read(final e e, final Builder builder) throws IOException {
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
                    case 36: {
                        if (a == 11) {
                            builder.timezone(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 35: {
                        if (a == 10) {
                            builder.rollup_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 34: {
                        if (a == 10) {
                            builder.adzerk_lifetime_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 33: {
                        if (a == 10) {
                            builder.writeoff_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 32: {
                        if (a == 10) {
                            builder.estimated_spending_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 31: {
                        if (a == 10) {
                            builder.max_billing_threshold_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 30: {
                        if (a == 11) {
                            builder.netsuite_customer_internal_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 29: {
                        if (a == 11) {
                            builder.level(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 28: {
                        if (a == 2) {
                            builder.is_effective(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 27: {
                        if (a == 2) {
                            builder.active(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 26: {
                        if (a == 11) {
                            builder.legacy_transaction_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 25: {
                        if (a == 11) {
                            builder.original_payment_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 24: {
                        if (a == 11) {
                            builder.payment_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 23: {
                        if (a == 2) {
                            builder.overwrite(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 22: {
                        if (a == 10) {
                            builder.total_refund_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 21: {
                        if (a == 10) {
                            builder.overdelivery_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 20: {
                        if (a == 10) {
                            builder.available_freebies_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 19: {
                        if (a == 10) {
                            builder.spent_freebies_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 18: {
                        if (a == 10) {
                            builder.total_payment_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 17: {
                        if (a == 10) {
                            builder.total_spending_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 10) {
                            builder.billing_threshold_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 10) {
                            builder.balance_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.credit_line_micros(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.admin_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 2) {
                            builder.servable(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.authorize_profile_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.authorize_payment_profile_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.line_item_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.end_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.start_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.user_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.last_modified_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.created_timestamp(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 10) {
                            builder.id(e.v());
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
        
        public void write(final e e, final FundingInstrument fundingInstrument) throws IOException {
            e.a0();
            if (fundingInstrument.id != null) {
                e.N(1, (byte)10);
                a.r(fundingInstrument.id, e);
            }
            if (fundingInstrument.created_timestamp != null) {
                e.N(2, (byte)10);
                a.r(fundingInstrument.created_timestamp, e);
            }
            if (fundingInstrument.last_modified_timestamp != null) {
                e.N(3, (byte)10);
                a.r(fundingInstrument.last_modified_timestamp, e);
            }
            if (fundingInstrument.user_id != null) {
                e.N(4, (byte)11);
                e.Z(fundingInstrument.user_id);
                e.O();
            }
            if (fundingInstrument.type != null) {
                e.N(5, (byte)11);
                e.Z(fundingInstrument.type);
                e.O();
            }
            if (fundingInstrument.start_timestamp != null) {
                e.N(6, (byte)10);
                a.r(fundingInstrument.start_timestamp, e);
            }
            if (fundingInstrument.end_timestamp != null) {
                e.N(7, (byte)10);
                a.r(fundingInstrument.end_timestamp, e);
            }
            if (fundingInstrument.name != null) {
                e.N(8, (byte)11);
                e.Z(fundingInstrument.name);
                e.O();
            }
            if (fundingInstrument.line_item_id != null) {
                e.N(9, (byte)11);
                e.Z(fundingInstrument.line_item_id);
                e.O();
            }
            if (fundingInstrument.authorize_payment_profile_id != null) {
                e.N(10, (byte)11);
                e.Z(fundingInstrument.authorize_payment_profile_id);
                e.O();
            }
            if (fundingInstrument.authorize_profile_id != null) {
                e.N(11, (byte)11);
                e.Z(fundingInstrument.authorize_profile_id);
                e.O();
            }
            if (fundingInstrument.servable != null) {
                e.N(12, (byte)2);
                d.z(fundingInstrument.servable, e);
            }
            if (fundingInstrument.admin_id != null) {
                e.N(13, (byte)11);
                e.Z(fundingInstrument.admin_id);
                e.O();
            }
            if (fundingInstrument.credit_line_micros != null) {
                e.N(14, (byte)10);
                a.r(fundingInstrument.credit_line_micros, e);
            }
            if (fundingInstrument.balance_micros != null) {
                e.N(15, (byte)10);
                a.r(fundingInstrument.balance_micros, e);
            }
            if (fundingInstrument.billing_threshold_micros != null) {
                e.N(16, (byte)10);
                a.r(fundingInstrument.billing_threshold_micros, e);
            }
            if (fundingInstrument.total_spending_micros != null) {
                e.N(17, (byte)10);
                a.r(fundingInstrument.total_spending_micros, e);
            }
            if (fundingInstrument.total_payment_micros != null) {
                e.N(18, (byte)10);
                a.r(fundingInstrument.total_payment_micros, e);
            }
            if (fundingInstrument.spent_freebies_micros != null) {
                e.N(19, (byte)10);
                a.r(fundingInstrument.spent_freebies_micros, e);
            }
            if (fundingInstrument.available_freebies_micros != null) {
                e.N(20, (byte)10);
                a.r(fundingInstrument.available_freebies_micros, e);
            }
            if (fundingInstrument.overdelivery_micros != null) {
                e.N(21, (byte)10);
                a.r(fundingInstrument.overdelivery_micros, e);
            }
            if (fundingInstrument.total_refund_micros != null) {
                e.N(22, (byte)10);
                a.r(fundingInstrument.total_refund_micros, e);
            }
            if (fundingInstrument.overwrite != null) {
                e.N(23, (byte)2);
                d.z(fundingInstrument.overwrite, e);
            }
            if (fundingInstrument.payment_id != null) {
                e.N(24, (byte)11);
                e.Z(fundingInstrument.payment_id);
                e.O();
            }
            if (fundingInstrument.original_payment_id != null) {
                e.N(25, (byte)11);
                e.Z(fundingInstrument.original_payment_id);
                e.O();
            }
            if (fundingInstrument.legacy_transaction_id != null) {
                e.N(26, (byte)11);
                e.Z(fundingInstrument.legacy_transaction_id);
                e.O();
            }
            if (fundingInstrument.active != null) {
                e.N(27, (byte)2);
                d.z(fundingInstrument.active, e);
            }
            if (fundingInstrument.is_effective != null) {
                e.N(28, (byte)2);
                d.z(fundingInstrument.is_effective, e);
            }
            if (fundingInstrument.level != null) {
                e.N(29, (byte)11);
                e.Z(fundingInstrument.level);
                e.O();
            }
            if (fundingInstrument.netsuite_customer_internal_id != null) {
                e.N(30, (byte)11);
                e.Z(fundingInstrument.netsuite_customer_internal_id);
                e.O();
            }
            if (fundingInstrument.max_billing_threshold_micros != null) {
                e.N(31, (byte)10);
                a.r(fundingInstrument.max_billing_threshold_micros, e);
            }
            if (fundingInstrument.estimated_spending_micros != null) {
                e.N(32, (byte)10);
                a.r(fundingInstrument.estimated_spending_micros, e);
            }
            if (fundingInstrument.writeoff_micros != null) {
                e.N(33, (byte)10);
                a.r(fundingInstrument.writeoff_micros, e);
            }
            if (fundingInstrument.adzerk_lifetime_micros != null) {
                e.N(34, (byte)10);
                a.r(fundingInstrument.adzerk_lifetime_micros, e);
            }
            if (fundingInstrument.rollup_timestamp != null) {
                e.N(35, (byte)10);
                a.r(fundingInstrument.rollup_timestamp, e);
            }
            if (fundingInstrument.timezone != null) {
                e.N(36, (byte)11);
                e.Z(fundingInstrument.timezone);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
