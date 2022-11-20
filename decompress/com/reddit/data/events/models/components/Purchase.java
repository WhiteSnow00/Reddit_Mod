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

public final class Purchase
{
    public static final a<Purchase, Builder> ADAPTER;
    public final Long count;
    public final Long count_remaining;
    public final String currency;
    public final Integer days_remaining;
    public final String local_currency;
    public final Long local_price_micros;
    public final String order_id;
    public final Long price_micros;
    public final String product_id;
    public final String product_type;
    public final Integer product_version;
    public final String subscription_id;
    public final String type;
    
    static {
        ADAPTER = (a)new PurchaseAdapter(null);
    }
    
    private Purchase(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.order_id = Builder.access$200(builder);
        this.product_type = Builder.access$300(builder);
        this.product_id = Builder.access$400(builder);
        this.product_version = Builder.access$500(builder);
        this.subscription_id = Builder.access$600(builder);
        this.count = Builder.access$700(builder);
        this.price_micros = Builder.access$800(builder);
        this.currency = Builder.access$900(builder);
        this.days_remaining = Builder.access$1000(builder);
        this.count_remaining = Builder.access$1100(builder);
        this.local_price_micros = Builder.access$1200(builder);
        this.local_currency = Builder.access$1300(builder);
    }
    
    public Purchase(final Builder builder, final Purchase$1 object) {
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
        if (!(o instanceof Purchase)) {
            return false;
        }
        final Purchase purchase = (Purchase)o;
        final String type = this.type;
        final String type2 = purchase.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String order_id = this.order_id;
            final String order_id2 = purchase.order_id;
            if (order_id == order_id2 || (order_id != null && order_id.equals(order_id2))) {
                final String product_type = this.product_type;
                final String product_type2 = purchase.product_type;
                if (product_type == product_type2 || (product_type != null && product_type.equals(product_type2))) {
                    final String product_id = this.product_id;
                    final String product_id2 = purchase.product_id;
                    if (product_id == product_id2 || (product_id != null && product_id.equals(product_id2))) {
                        final Integer product_version = this.product_version;
                        final Integer product_version2 = purchase.product_version;
                        if (product_version == product_version2 || (product_version != null && product_version.equals(product_version2))) {
                            final String subscription_id = this.subscription_id;
                            final String subscription_id2 = purchase.subscription_id;
                            if (subscription_id == subscription_id2 || (subscription_id != null && subscription_id.equals(subscription_id2))) {
                                final Long count = this.count;
                                final Long count2 = purchase.count;
                                if (count == count2 || (count != null && count.equals(count2))) {
                                    final Long price_micros = this.price_micros;
                                    final Long price_micros2 = purchase.price_micros;
                                    if (price_micros == price_micros2 || (price_micros != null && price_micros.equals(price_micros2))) {
                                        final String currency = this.currency;
                                        final String currency2 = purchase.currency;
                                        if (currency == currency2 || (currency != null && currency.equals(currency2))) {
                                            final Integer days_remaining = this.days_remaining;
                                            final Integer days_remaining2 = purchase.days_remaining;
                                            if (days_remaining == days_remaining2 || (days_remaining != null && days_remaining.equals(days_remaining2))) {
                                                final Long count_remaining = this.count_remaining;
                                                final Long count_remaining2 = purchase.count_remaining;
                                                if (count_remaining == count_remaining2 || (count_remaining != null && count_remaining.equals(count_remaining2))) {
                                                    final Long local_price_micros = this.local_price_micros;
                                                    final Long local_price_micros2 = purchase.local_price_micros;
                                                    if (local_price_micros == local_price_micros2 || (local_price_micros != null && local_price_micros.equals(local_price_micros2))) {
                                                        final String local_currency = this.local_currency;
                                                        final String local_currency2 = purchase.local_currency;
                                                        boolean b2 = b;
                                                        if (local_currency == local_currency2) {
                                                            return b2;
                                                        }
                                                        if (local_currency != null && local_currency.equals(local_currency2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final String order_id = this.order_id;
        int hashCode3;
        if (order_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = order_id.hashCode();
        }
        final String product_type = this.product_type;
        int hashCode4;
        if (product_type == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = product_type.hashCode();
        }
        final String product_id = this.product_id;
        int hashCode5;
        if (product_id == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = product_id.hashCode();
        }
        final Integer product_version = this.product_version;
        int hashCode6;
        if (product_version == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = product_version.hashCode();
        }
        final String subscription_id = this.subscription_id;
        int hashCode7;
        if (subscription_id == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = subscription_id.hashCode();
        }
        final Long count = this.count;
        int hashCode8;
        if (count == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = count.hashCode();
        }
        final Long price_micros = this.price_micros;
        int hashCode9;
        if (price_micros == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = price_micros.hashCode();
        }
        final String currency = this.currency;
        int hashCode10;
        if (currency == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = currency.hashCode();
        }
        final Integer days_remaining = this.days_remaining;
        int hashCode11;
        if (days_remaining == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = days_remaining.hashCode();
        }
        final Long count_remaining = this.count_remaining;
        int hashCode12;
        if (count_remaining == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = count_remaining.hashCode();
        }
        final Long local_price_micros = this.local_price_micros;
        int hashCode13;
        if (local_price_micros == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = local_price_micros.hashCode();
        }
        final String local_currency = this.local_currency;
        if (local_currency != null) {
            hashCode = local_currency.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Purchase{type=");
        t.append(this.type);
        t.append(", order_id=");
        t.append(this.order_id);
        t.append(", product_type=");
        t.append(this.product_type);
        t.append(", product_id=");
        t.append(this.product_id);
        t.append(", product_version=");
        t.append(this.product_version);
        t.append(", subscription_id=");
        t.append(this.subscription_id);
        t.append(", count=");
        t.append(this.count);
        t.append(", price_micros=");
        t.append(this.price_micros);
        t.append(", currency=");
        t.append(this.currency);
        t.append(", days_remaining=");
        t.append(this.days_remaining);
        t.append(", count_remaining=");
        t.append(this.count_remaining);
        t.append(", local_price_micros=");
        t.append(this.local_price_micros);
        t.append(", local_currency=");
        return ph0.a.f(t, this.local_currency, "}");
    }
    
    public void write(final e e) throws IOException {
        Purchase.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Purchase>
    {
        private Long count;
        private Long count_remaining;
        private String currency;
        private Integer days_remaining;
        private String local_currency;
        private Long local_price_micros;
        private String order_id;
        private Long price_micros;
        private String product_id;
        private String product_type;
        private Integer product_version;
        private String subscription_id;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Purchase purchase) {
            this.type = purchase.type;
            this.order_id = purchase.order_id;
            this.product_type = purchase.product_type;
            this.product_id = purchase.product_id;
            this.product_version = purchase.product_version;
            this.subscription_id = purchase.subscription_id;
            this.count = purchase.count;
            this.price_micros = purchase.price_micros;
            this.currency = purchase.currency;
            this.days_remaining = purchase.days_remaining;
            this.count_remaining = purchase.count_remaining;
            this.local_price_micros = purchase.local_price_micros;
            this.local_currency = purchase.local_currency;
        }
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static Integer access$1000(final Builder builder) {
            return builder.days_remaining;
        }
        
        public static Long access$1100(final Builder builder) {
            return builder.count_remaining;
        }
        
        public static Long access$1200(final Builder builder) {
            return builder.local_price_micros;
        }
        
        public static String access$1300(final Builder builder) {
            return builder.local_currency;
        }
        
        public static String access$200(final Builder builder) {
            return builder.order_id;
        }
        
        public static String access$300(final Builder builder) {
            return builder.product_type;
        }
        
        public static String access$400(final Builder builder) {
            return builder.product_id;
        }
        
        public static Integer access$500(final Builder builder) {
            return builder.product_version;
        }
        
        public static String access$600(final Builder builder) {
            return builder.subscription_id;
        }
        
        public static Long access$700(final Builder builder) {
            return builder.count;
        }
        
        public static Long access$800(final Builder builder) {
            return builder.price_micros;
        }
        
        public static String access$900(final Builder builder) {
            return builder.currency;
        }
        
        public Purchase build() {
            return new Purchase(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder count(final Long count) {
            this.count = count;
            return this;
        }
        
        public Builder count_remaining(final Long count_remaining) {
            this.count_remaining = count_remaining;
            return this;
        }
        
        public Builder currency(final String currency) {
            this.currency = currency;
            return this;
        }
        
        public Builder days_remaining(final Integer days_remaining) {
            this.days_remaining = days_remaining;
            return this;
        }
        
        public Builder local_currency(final String local_currency) {
            this.local_currency = local_currency;
            return this;
        }
        
        public Builder local_price_micros(final Long local_price_micros) {
            this.local_price_micros = local_price_micros;
            return this;
        }
        
        public Builder order_id(final String order_id) {
            this.order_id = order_id;
            return this;
        }
        
        public Builder price_micros(final Long price_micros) {
            this.price_micros = price_micros;
            return this;
        }
        
        public Builder product_id(final String product_id) {
            this.product_id = product_id;
            return this;
        }
        
        public Builder product_type(final String product_type) {
            this.product_type = product_type;
            return this;
        }
        
        public Builder product_version(final Integer product_version) {
            this.product_version = product_version;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.order_id = null;
            this.product_type = null;
            this.product_id = null;
            this.product_version = null;
            this.subscription_id = null;
            this.count = null;
            this.price_micros = null;
            this.currency = null;
            this.days_remaining = null;
            this.count_remaining = null;
            this.local_price_micros = null;
            this.local_currency = null;
        }
        
        public Builder subscription_id(final String subscription_id) {
            this.subscription_id = subscription_id;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class PurchaseAdapter implements a<Purchase, Builder>
    {
        private PurchaseAdapter() {
        }
        
        public PurchaseAdapter(final Purchase$1 object) {
            this();
        }
        
        public Purchase read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Purchase read(final e e, final Builder builder) throws IOException {
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
                    case 13: {
                        if (a == 11) {
                            builder.local_currency(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 10) {
                            builder.local_price_micros(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 10) {
                            builder.count_remaining(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 8) {
                            builder.days_remaining(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.currency(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 10) {
                            builder.price_micros(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.count(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.subscription_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 8) {
                            builder.product_version(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.product_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.product_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.order_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
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
        
        public void write(final e e, final Purchase purchase) throws IOException {
            e.X();
            if (purchase.type != null) {
                e.O(1, (byte)11);
                e.W(purchase.type);
                e.P();
            }
            if (purchase.order_id != null) {
                e.O(2, (byte)11);
                e.W(purchase.order_id);
                e.P();
            }
            if (purchase.product_type != null) {
                e.O(3, (byte)11);
                e.W(purchase.product_type);
                e.P();
            }
            if (purchase.product_id != null) {
                e.O(4, (byte)11);
                e.W(purchase.product_id);
                e.P();
            }
            if (purchase.product_version != null) {
                e.O(5, (byte)8);
                aq2.a.x(purchase.product_version, e);
            }
            if (purchase.subscription_id != null) {
                e.O(6, (byte)11);
                e.W(purchase.subscription_id);
                e.P();
            }
            if (purchase.count != null) {
                e.O(7, (byte)10);
                k.w(purchase.count, e);
            }
            if (purchase.price_micros != null) {
                e.O(8, (byte)10);
                k.w(purchase.price_micros, e);
            }
            if (purchase.currency != null) {
                e.O(9, (byte)11);
                e.W(purchase.currency);
                e.P();
            }
            if (purchase.days_remaining != null) {
                e.O(10, (byte)8);
                aq2.a.x(purchase.days_remaining, e);
            }
            if (purchase.count_remaining != null) {
                e.O(11, (byte)10);
                k.w(purchase.count_remaining, e);
            }
            if (purchase.local_price_micros != null) {
                e.O(12, (byte)10);
                k.w(purchase.local_price_micros, e);
            }
            if (purchase.local_currency != null) {
                e.O(13, (byte)11);
                e.W(purchase.local_currency);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Purchase)o);
        }
    }
}
