// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Payment
{
    public static final a<Payment, Builder> ADAPTER;
    public final Long amount_in_smallest_denom;
    public final String currency;
    public final String default_option;
    public final Long default_usd_amount;
    public final String error;
    public final Long local_amount_in_smallest_denom;
    public final String local_currency;
    public final String method;
    public final String new_status;
    public final String old_status;
    public final Long payment_id;
    public final String status;
    public final String status_reason;
    public final String stored_credit_card_state;
    
    static {
        ADAPTER = (a)new PaymentAdapter(null);
    }
    
    private Payment(final Builder builder) {
        this.method = Builder.access$100(builder);
        this.currency = Builder.access$200(builder);
        this.amount_in_smallest_denom = Builder.access$300(builder);
        this.default_option = Builder.access$400(builder);
        this.stored_credit_card_state = Builder.access$500(builder);
        this.local_currency = Builder.access$600(builder);
        this.local_amount_in_smallest_denom = Builder.access$700(builder);
        this.default_usd_amount = Builder.access$800(builder);
        this.status = Builder.access$900(builder);
        this.status_reason = Builder.access$1000(builder);
        this.error = Builder.access$1100(builder);
        this.old_status = Builder.access$1200(builder);
        this.new_status = Builder.access$1300(builder);
        this.payment_id = Builder.access$1400(builder);
    }
    
    public Payment(final Builder builder, final Payment$1 object) {
        this(builder);
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
        if (!(o instanceof Payment)) {
            return false;
        }
        final Payment payment = (Payment)o;
        final String method = this.method;
        final String method2 = payment.method;
        if (method == method2 || (method != null && method.equals(method2))) {
            final String currency = this.currency;
            final String currency2 = payment.currency;
            if (currency == currency2 || (currency != null && currency.equals(currency2))) {
                final Long amount_in_smallest_denom = this.amount_in_smallest_denom;
                final Long amount_in_smallest_denom2 = payment.amount_in_smallest_denom;
                if (amount_in_smallest_denom == amount_in_smallest_denom2 || (amount_in_smallest_denom != null && amount_in_smallest_denom.equals(amount_in_smallest_denom2))) {
                    final String default_option = this.default_option;
                    final String default_option2 = payment.default_option;
                    if (default_option == default_option2 || (default_option != null && default_option.equals(default_option2))) {
                        final String stored_credit_card_state = this.stored_credit_card_state;
                        final String stored_credit_card_state2 = payment.stored_credit_card_state;
                        if (stored_credit_card_state == stored_credit_card_state2 || (stored_credit_card_state != null && stored_credit_card_state.equals(stored_credit_card_state2))) {
                            final String local_currency = this.local_currency;
                            final String local_currency2 = payment.local_currency;
                            if (local_currency == local_currency2 || (local_currency != null && local_currency.equals(local_currency2))) {
                                final Long local_amount_in_smallest_denom = this.local_amount_in_smallest_denom;
                                final Long local_amount_in_smallest_denom2 = payment.local_amount_in_smallest_denom;
                                if (local_amount_in_smallest_denom == local_amount_in_smallest_denom2 || (local_amount_in_smallest_denom != null && local_amount_in_smallest_denom.equals(local_amount_in_smallest_denom2))) {
                                    final Long default_usd_amount = this.default_usd_amount;
                                    final Long default_usd_amount2 = payment.default_usd_amount;
                                    if (default_usd_amount == default_usd_amount2 || (default_usd_amount != null && default_usd_amount.equals(default_usd_amount2))) {
                                        final String status = this.status;
                                        final String status2 = payment.status;
                                        if (status == status2 || (status != null && status.equals(status2))) {
                                            final String status_reason = this.status_reason;
                                            final String status_reason2 = payment.status_reason;
                                            if (status_reason == status_reason2 || (status_reason != null && status_reason.equals(status_reason2))) {
                                                final String error = this.error;
                                                final String error2 = payment.error;
                                                if (error == error2 || (error != null && error.equals(error2))) {
                                                    final String old_status = this.old_status;
                                                    final String old_status2 = payment.old_status;
                                                    if (old_status == old_status2 || (old_status != null && old_status.equals(old_status2))) {
                                                        final String new_status = this.new_status;
                                                        final String new_status2 = payment.new_status;
                                                        if (new_status == new_status2 || (new_status != null && new_status.equals(new_status2))) {
                                                            final Long payment_id = this.payment_id;
                                                            final Long payment_id2 = payment.payment_id;
                                                            boolean b2 = b;
                                                            if (payment_id == payment_id2) {
                                                                return b2;
                                                            }
                                                            if (payment_id != null && payment_id.equals(payment_id2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String method = this.method;
        int hashCode = 0;
        int hashCode2;
        if (method == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = method.hashCode();
        }
        final String currency = this.currency;
        int hashCode3;
        if (currency == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = currency.hashCode();
        }
        final Long amount_in_smallest_denom = this.amount_in_smallest_denom;
        int hashCode4;
        if (amount_in_smallest_denom == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = amount_in_smallest_denom.hashCode();
        }
        final String default_option = this.default_option;
        int hashCode5;
        if (default_option == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = default_option.hashCode();
        }
        final String stored_credit_card_state = this.stored_credit_card_state;
        int hashCode6;
        if (stored_credit_card_state == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = stored_credit_card_state.hashCode();
        }
        final String local_currency = this.local_currency;
        int hashCode7;
        if (local_currency == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = local_currency.hashCode();
        }
        final Long local_amount_in_smallest_denom = this.local_amount_in_smallest_denom;
        int hashCode8;
        if (local_amount_in_smallest_denom == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = local_amount_in_smallest_denom.hashCode();
        }
        final Long default_usd_amount = this.default_usd_amount;
        int hashCode9;
        if (default_usd_amount == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = default_usd_amount.hashCode();
        }
        final String status = this.status;
        int hashCode10;
        if (status == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = status.hashCode();
        }
        final String status_reason = this.status_reason;
        int hashCode11;
        if (status_reason == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = status_reason.hashCode();
        }
        final String error = this.error;
        int hashCode12;
        if (error == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = error.hashCode();
        }
        final String old_status = this.old_status;
        int hashCode13;
        if (old_status == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = old_status.hashCode();
        }
        final String new_status = this.new_status;
        int hashCode14;
        if (new_status == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = new_status.hashCode();
        }
        final Long payment_id = this.payment_id;
        if (payment_id != null) {
            hashCode = payment_id.hashCode();
        }
        return ((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Payment{method=");
        t.append(this.method);
        t.append(", currency=");
        t.append(this.currency);
        t.append(", amount_in_smallest_denom=");
        t.append(this.amount_in_smallest_denom);
        t.append(", default_option=");
        t.append(this.default_option);
        t.append(", stored_credit_card_state=");
        t.append(this.stored_credit_card_state);
        t.append(", local_currency=");
        t.append(this.local_currency);
        t.append(", local_amount_in_smallest_denom=");
        t.append(this.local_amount_in_smallest_denom);
        t.append(", default_usd_amount=");
        t.append(this.default_usd_amount);
        t.append(", status=");
        t.append(this.status);
        t.append(", status_reason=");
        t.append(this.status_reason);
        t.append(", error=");
        t.append(this.error);
        t.append(", old_status=");
        t.append(this.old_status);
        t.append(", new_status=");
        t.append(this.new_status);
        t.append(", payment_id=");
        return d.l(t, this.payment_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Payment.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Payment>
    {
        private Long amount_in_smallest_denom;
        private String currency;
        private String default_option;
        private Long default_usd_amount;
        private String error;
        private Long local_amount_in_smallest_denom;
        private String local_currency;
        private String method;
        private String new_status;
        private String old_status;
        private Long payment_id;
        private String status;
        private String status_reason;
        private String stored_credit_card_state;
        
        public Builder() {
        }
        
        public Builder(final Payment payment) {
            this.method = payment.method;
            this.currency = payment.currency;
            this.amount_in_smallest_denom = payment.amount_in_smallest_denom;
            this.default_option = payment.default_option;
            this.stored_credit_card_state = payment.stored_credit_card_state;
            this.local_currency = payment.local_currency;
            this.local_amount_in_smallest_denom = payment.local_amount_in_smallest_denom;
            this.default_usd_amount = payment.default_usd_amount;
            this.status = payment.status;
            this.status_reason = payment.status_reason;
            this.error = payment.error;
            this.old_status = payment.old_status;
            this.new_status = payment.new_status;
            this.payment_id = payment.payment_id;
        }
        
        public static String access$100(final Builder builder) {
            return builder.method;
        }
        
        public static String access$1000(final Builder builder) {
            return builder.status_reason;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.error;
        }
        
        public static String access$1200(final Builder builder) {
            return builder.old_status;
        }
        
        public static String access$1300(final Builder builder) {
            return builder.new_status;
        }
        
        public static Long access$1400(final Builder builder) {
            return builder.payment_id;
        }
        
        public static String access$200(final Builder builder) {
            return builder.currency;
        }
        
        public static Long access$300(final Builder builder) {
            return builder.amount_in_smallest_denom;
        }
        
        public static String access$400(final Builder builder) {
            return builder.default_option;
        }
        
        public static String access$500(final Builder builder) {
            return builder.stored_credit_card_state;
        }
        
        public static String access$600(final Builder builder) {
            return builder.local_currency;
        }
        
        public static Long access$700(final Builder builder) {
            return builder.local_amount_in_smallest_denom;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.default_usd_amount;
        }
        
        public static String access$900(final Builder builder) {
            return builder.status;
        }
        
        public Builder amount_in_smallest_denom(final Long amount_in_smallest_denom) {
            this.amount_in_smallest_denom = amount_in_smallest_denom;
            return this;
        }
        
        public Payment build() {
            return new Payment(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder currency(final String currency) {
            this.currency = currency;
            return this;
        }
        
        public Builder default_option(final String default_option) {
            this.default_option = default_option;
            return this;
        }
        
        public Builder default_usd_amount(final Long default_usd_amount) {
            this.default_usd_amount = default_usd_amount;
            return this;
        }
        
        public Builder error(final String error) {
            this.error = error;
            return this;
        }
        
        public Builder local_amount_in_smallest_denom(final Long local_amount_in_smallest_denom) {
            this.local_amount_in_smallest_denom = local_amount_in_smallest_denom;
            return this;
        }
        
        public Builder local_currency(final String local_currency) {
            this.local_currency = local_currency;
            return this;
        }
        
        public Builder method(final String method) {
            this.method = method;
            return this;
        }
        
        public Builder new_status(final String new_status) {
            this.new_status = new_status;
            return this;
        }
        
        public Builder old_status(final String old_status) {
            this.old_status = old_status;
            return this;
        }
        
        public Builder payment_id(final Long payment_id) {
            this.payment_id = payment_id;
            return this;
        }
        
        public void reset() {
            this.method = null;
            this.currency = null;
            this.amount_in_smallest_denom = null;
            this.default_option = null;
            this.stored_credit_card_state = null;
            this.local_currency = null;
            this.local_amount_in_smallest_denom = null;
            this.default_usd_amount = null;
            this.status = null;
            this.status_reason = null;
            this.error = null;
            this.old_status = null;
            this.new_status = null;
            this.payment_id = null;
        }
        
        public Builder status(final String status) {
            this.status = status;
            return this;
        }
        
        public Builder status_reason(final String status_reason) {
            this.status_reason = status_reason;
            return this;
        }
        
        public Builder stored_credit_card_state(final String stored_credit_card_state) {
            this.stored_credit_card_state = stored_credit_card_state;
            return this;
        }
    }
    
    public static final class PaymentAdapter implements a<Payment, Builder>
    {
        private PaymentAdapter() {
        }
        
        public PaymentAdapter(final Payment$1 object) {
            this();
        }
        
        public Payment read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Payment read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.payment_id(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.new_status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.old_status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.error(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 11) {
                            builder.status_reason(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.status(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.default_usd_amount(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.local_amount_in_smallest_denom(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.local_currency(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.stored_credit_card_state(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.default_option(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.amount_in_smallest_denom(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.currency(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.method(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final Payment payment) throws IOException {
            e.X();
            if (payment.method != null) {
                e.O(1, (byte)11);
                e.W(payment.method);
                e.P();
            }
            if (payment.currency != null) {
                e.O(2, (byte)11);
                e.W(payment.currency);
                e.P();
            }
            if (payment.amount_in_smallest_denom != null) {
                e.O(3, (byte)10);
                k.w(payment.amount_in_smallest_denom, e);
            }
            if (payment.default_option != null) {
                e.O(4, (byte)11);
                e.W(payment.default_option);
                e.P();
            }
            if (payment.stored_credit_card_state != null) {
                e.O(5, (byte)11);
                e.W(payment.stored_credit_card_state);
                e.P();
            }
            if (payment.local_currency != null) {
                e.O(6, (byte)11);
                e.W(payment.local_currency);
                e.P();
            }
            if (payment.local_amount_in_smallest_denom != null) {
                e.O(7, (byte)10);
                k.w(payment.local_amount_in_smallest_denom, e);
            }
            if (payment.default_usd_amount != null) {
                e.O(8, (byte)10);
                k.w(payment.default_usd_amount, e);
            }
            if (payment.status != null) {
                e.O(9, (byte)11);
                e.W(payment.status);
                e.P();
            }
            if (payment.status_reason != null) {
                e.O(10, (byte)11);
                e.W(payment.status_reason);
                e.P();
            }
            if (payment.error != null) {
                e.O(11, (byte)11);
                e.W(payment.error);
                e.P();
            }
            if (payment.old_status != null) {
                e.O(12, (byte)11);
                e.W(payment.old_status);
                e.P();
            }
            if (payment.new_status != null) {
                e.O(13, (byte)11);
                e.W(payment.new_status);
                e.P();
            }
            if (payment.payment_id != null) {
                e.O(14, (byte)10);
                k.w(payment.payment_id, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Payment)o);
        }
    }
}
