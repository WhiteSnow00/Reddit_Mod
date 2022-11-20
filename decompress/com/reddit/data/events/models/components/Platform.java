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

public final class Platform
{
    public static final a<Platform, Builder> ADAPTER;
    public final Long available_memory;
    public final String browser_name;
    public final String browser_version;
    public final String connection_type;
    public final String device_id;
    public final String device_manufacturer;
    public final String device_name;
    public final String device_tier;
    public final Long download_speed;
    public final String fingerprint;
    public final Long fingerprint_created_timestamp;
    public final String language_list;
    public final String name;
    public final String os_name;
    public final String os_version;
    public final String primary_language;
    public final Integer year_class;
    
    static {
        ADAPTER = (a)new PlatformAdapter(null);
    }
    
    private Platform(final Builder builder) {
        this.name = Builder.access$100(builder);
        this.device_id = Builder.access$200(builder);
        this.device_name = Builder.access$300(builder);
        this.os_name = Builder.access$400(builder);
        this.os_version = Builder.access$500(builder);
        this.browser_name = Builder.access$600(builder);
        this.browser_version = Builder.access$700(builder);
        this.fingerprint = Builder.access$800(builder);
        this.fingerprint_created_timestamp = Builder.access$900(builder);
        this.year_class = Builder.access$1000(builder);
        this.device_tier = Builder.access$1100(builder);
        this.primary_language = Builder.access$1200(builder);
        this.language_list = Builder.access$1300(builder);
        this.available_memory = Builder.access$1400(builder);
        this.download_speed = Builder.access$1500(builder);
        this.connection_type = Builder.access$1600(builder);
        this.device_manufacturer = Builder.access$1700(builder);
    }
    
    public Platform(final Builder builder, final Platform$1 object) {
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
        if (!(o instanceof Platform)) {
            return false;
        }
        final Platform platform = (Platform)o;
        final String name = this.name;
        final String name2 = platform.name;
        if (name == name2 || (name != null && name.equals(name2))) {
            final String device_id = this.device_id;
            final String device_id2 = platform.device_id;
            if (device_id == device_id2 || (device_id != null && device_id.equals(device_id2))) {
                final String device_name = this.device_name;
                final String device_name2 = platform.device_name;
                if (device_name == device_name2 || (device_name != null && device_name.equals(device_name2))) {
                    final String os_name = this.os_name;
                    final String os_name2 = platform.os_name;
                    if (os_name == os_name2 || (os_name != null && os_name.equals(os_name2))) {
                        final String os_version = this.os_version;
                        final String os_version2 = platform.os_version;
                        if (os_version == os_version2 || (os_version != null && os_version.equals(os_version2))) {
                            final String browser_name = this.browser_name;
                            final String browser_name2 = platform.browser_name;
                            if (browser_name == browser_name2 || (browser_name != null && browser_name.equals(browser_name2))) {
                                final String browser_version = this.browser_version;
                                final String browser_version2 = platform.browser_version;
                                if (browser_version == browser_version2 || (browser_version != null && browser_version.equals(browser_version2))) {
                                    final String fingerprint = this.fingerprint;
                                    final String fingerprint2 = platform.fingerprint;
                                    if (fingerprint == fingerprint2 || (fingerprint != null && fingerprint.equals(fingerprint2))) {
                                        final Long fingerprint_created_timestamp = this.fingerprint_created_timestamp;
                                        final Long fingerprint_created_timestamp2 = platform.fingerprint_created_timestamp;
                                        if (fingerprint_created_timestamp == fingerprint_created_timestamp2 || (fingerprint_created_timestamp != null && fingerprint_created_timestamp.equals(fingerprint_created_timestamp2))) {
                                            final Integer year_class = this.year_class;
                                            final Integer year_class2 = platform.year_class;
                                            if (year_class == year_class2 || (year_class != null && year_class.equals(year_class2))) {
                                                final String device_tier = this.device_tier;
                                                final String device_tier2 = platform.device_tier;
                                                if (device_tier == device_tier2 || (device_tier != null && device_tier.equals(device_tier2))) {
                                                    final String primary_language = this.primary_language;
                                                    final String primary_language2 = platform.primary_language;
                                                    if (primary_language == primary_language2 || (primary_language != null && primary_language.equals(primary_language2))) {
                                                        final String language_list = this.language_list;
                                                        final String language_list2 = platform.language_list;
                                                        if (language_list == language_list2 || (language_list != null && language_list.equals(language_list2))) {
                                                            final Long available_memory = this.available_memory;
                                                            final Long available_memory2 = platform.available_memory;
                                                            if (available_memory == available_memory2 || (available_memory != null && available_memory.equals(available_memory2))) {
                                                                final Long download_speed = this.download_speed;
                                                                final Long download_speed2 = platform.download_speed;
                                                                if (download_speed == download_speed2 || (download_speed != null && download_speed.equals(download_speed2))) {
                                                                    final String connection_type = this.connection_type;
                                                                    final String connection_type2 = platform.connection_type;
                                                                    if (connection_type == connection_type2 || (connection_type != null && connection_type.equals(connection_type2))) {
                                                                        final String device_manufacturer = this.device_manufacturer;
                                                                        final String device_manufacturer2 = platform.device_manufacturer;
                                                                        boolean b2 = b;
                                                                        if (device_manufacturer == device_manufacturer2) {
                                                                            return b2;
                                                                        }
                                                                        if (device_manufacturer != null && device_manufacturer.equals(device_manufacturer2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final String name = this.name;
        int hashCode = 0;
        int hashCode2;
        if (name == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = name.hashCode();
        }
        final String device_id = this.device_id;
        int hashCode3;
        if (device_id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = device_id.hashCode();
        }
        final String device_name = this.device_name;
        int hashCode4;
        if (device_name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = device_name.hashCode();
        }
        final String os_name = this.os_name;
        int hashCode5;
        if (os_name == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = os_name.hashCode();
        }
        final String os_version = this.os_version;
        int hashCode6;
        if (os_version == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = os_version.hashCode();
        }
        final String browser_name = this.browser_name;
        int hashCode7;
        if (browser_name == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = browser_name.hashCode();
        }
        final String browser_version = this.browser_version;
        int hashCode8;
        if (browser_version == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = browser_version.hashCode();
        }
        final String fingerprint = this.fingerprint;
        int hashCode9;
        if (fingerprint == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = fingerprint.hashCode();
        }
        final Long fingerprint_created_timestamp = this.fingerprint_created_timestamp;
        int hashCode10;
        if (fingerprint_created_timestamp == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = fingerprint_created_timestamp.hashCode();
        }
        final Integer year_class = this.year_class;
        int hashCode11;
        if (year_class == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = year_class.hashCode();
        }
        final String device_tier = this.device_tier;
        int hashCode12;
        if (device_tier == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = device_tier.hashCode();
        }
        final String primary_language = this.primary_language;
        int hashCode13;
        if (primary_language == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = primary_language.hashCode();
        }
        final String language_list = this.language_list;
        int hashCode14;
        if (language_list == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = language_list.hashCode();
        }
        final Long available_memory = this.available_memory;
        int hashCode15;
        if (available_memory == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = available_memory.hashCode();
        }
        final Long download_speed = this.download_speed;
        int hashCode16;
        if (download_speed == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = download_speed.hashCode();
        }
        final String connection_type = this.connection_type;
        int hashCode17;
        if (connection_type == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = connection_type.hashCode();
        }
        final String device_manufacturer = this.device_manufacturer;
        if (device_manufacturer != null) {
            hashCode = device_manufacturer.hashCode();
        }
        return (((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Platform{name=");
        t.append(this.name);
        t.append(", device_id=");
        t.append(this.device_id);
        t.append(", device_name=");
        t.append(this.device_name);
        t.append(", os_name=");
        t.append(this.os_name);
        t.append(", os_version=");
        t.append(this.os_version);
        t.append(", browser_name=");
        t.append(this.browser_name);
        t.append(", browser_version=");
        t.append(this.browser_version);
        t.append(", fingerprint=");
        t.append(this.fingerprint);
        t.append(", fingerprint_created_timestamp=");
        t.append(this.fingerprint_created_timestamp);
        t.append(", year_class=");
        t.append(this.year_class);
        t.append(", device_tier=");
        t.append(this.device_tier);
        t.append(", primary_language=");
        t.append(this.primary_language);
        t.append(", language_list=");
        t.append(this.language_list);
        t.append(", available_memory=");
        t.append(this.available_memory);
        t.append(", download_speed=");
        t.append(this.download_speed);
        t.append(", connection_type=");
        t.append(this.connection_type);
        t.append(", device_manufacturer=");
        return ph0.a.f(t, this.device_manufacturer, "}");
    }
    
    public void write(final e e) throws IOException {
        Platform.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Platform>
    {
        private Long available_memory;
        private String browser_name;
        private String browser_version;
        private String connection_type;
        private String device_id;
        private String device_manufacturer;
        private String device_name;
        private String device_tier;
        private Long download_speed;
        private String fingerprint;
        private Long fingerprint_created_timestamp;
        private String language_list;
        private String name;
        private String os_name;
        private String os_version;
        private String primary_language;
        private Integer year_class;
        
        public Builder() {
        }
        
        public Builder(final Platform platform) {
            this.name = platform.name;
            this.device_id = platform.device_id;
            this.device_name = platform.device_name;
            this.os_name = platform.os_name;
            this.os_version = platform.os_version;
            this.browser_name = platform.browser_name;
            this.browser_version = platform.browser_version;
            this.fingerprint = platform.fingerprint;
            this.fingerprint_created_timestamp = platform.fingerprint_created_timestamp;
            this.year_class = platform.year_class;
            this.device_tier = platform.device_tier;
            this.primary_language = platform.primary_language;
            this.language_list = platform.language_list;
            this.available_memory = platform.available_memory;
            this.download_speed = platform.download_speed;
            this.connection_type = platform.connection_type;
            this.device_manufacturer = platform.device_manufacturer;
        }
        
        public static String access$100(final Builder builder) {
            return builder.name;
        }
        
        public static Integer access$1000(final Builder builder) {
            return builder.year_class;
        }
        
        public static String access$1100(final Builder builder) {
            return builder.device_tier;
        }
        
        public static String access$1200(final Builder builder) {
            return builder.primary_language;
        }
        
        public static String access$1300(final Builder builder) {
            return builder.language_list;
        }
        
        public static Long access$1400(final Builder builder) {
            return builder.available_memory;
        }
        
        public static Long access$1500(final Builder builder) {
            return builder.download_speed;
        }
        
        public static String access$1600(final Builder builder) {
            return builder.connection_type;
        }
        
        public static String access$1700(final Builder builder) {
            return builder.device_manufacturer;
        }
        
        public static String access$200(final Builder builder) {
            return builder.device_id;
        }
        
        public static String access$300(final Builder builder) {
            return builder.device_name;
        }
        
        public static String access$400(final Builder builder) {
            return builder.os_name;
        }
        
        public static String access$500(final Builder builder) {
            return builder.os_version;
        }
        
        public static String access$600(final Builder builder) {
            return builder.browser_name;
        }
        
        public static String access$700(final Builder builder) {
            return builder.browser_version;
        }
        
        public static String access$800(final Builder builder) {
            return builder.fingerprint;
        }
        
        public static Long access$900(final Builder builder) {
            return builder.fingerprint_created_timestamp;
        }
        
        public Builder available_memory(final Long available_memory) {
            this.available_memory = available_memory;
            return this;
        }
        
        public Builder browser_name(final String browser_name) {
            this.browser_name = browser_name;
            return this;
        }
        
        public Builder browser_version(final String browser_version) {
            this.browser_version = browser_version;
            return this;
        }
        
        public Platform build() {
            return new Platform(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder connection_type(final String connection_type) {
            this.connection_type = connection_type;
            return this;
        }
        
        public Builder device_id(final String device_id) {
            this.device_id = device_id;
            return this;
        }
        
        public Builder device_manufacturer(final String device_manufacturer) {
            this.device_manufacturer = device_manufacturer;
            return this;
        }
        
        public Builder device_name(final String device_name) {
            this.device_name = device_name;
            return this;
        }
        
        public Builder device_tier(final String device_tier) {
            this.device_tier = device_tier;
            return this;
        }
        
        public Builder download_speed(final Long download_speed) {
            this.download_speed = download_speed;
            return this;
        }
        
        public Builder fingerprint(final String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        
        public Builder fingerprint_created_timestamp(final Long fingerprint_created_timestamp) {
            this.fingerprint_created_timestamp = fingerprint_created_timestamp;
            return this;
        }
        
        public Builder language_list(final String language_list) {
            this.language_list = language_list;
            return this;
        }
        
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        
        public Builder os_name(final String os_name) {
            this.os_name = os_name;
            return this;
        }
        
        public Builder os_version(final String os_version) {
            this.os_version = os_version;
            return this;
        }
        
        public Builder primary_language(final String primary_language) {
            this.primary_language = primary_language;
            return this;
        }
        
        public void reset() {
            this.name = null;
            this.device_id = null;
            this.device_name = null;
            this.os_name = null;
            this.os_version = null;
            this.browser_name = null;
            this.browser_version = null;
            this.fingerprint = null;
            this.fingerprint_created_timestamp = null;
            this.year_class = null;
            this.device_tier = null;
            this.primary_language = null;
            this.language_list = null;
            this.available_memory = null;
            this.download_speed = null;
            this.connection_type = null;
            this.device_manufacturer = null;
        }
        
        public Builder year_class(final Integer year_class) {
            this.year_class = year_class;
            return this;
        }
    }
    
    public static final class PlatformAdapter implements a<Platform, Builder>
    {
        private PlatformAdapter() {
        }
        
        public PlatformAdapter(final Platform$1 object) {
            this();
        }
        
        public Platform read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Platform read(final e e, final Builder builder) throws IOException {
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
                    case 17: {
                        if (a == 11) {
                            builder.device_manufacturer(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 16: {
                        if (a == 11) {
                            builder.connection_type(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 15: {
                        if (a == 10) {
                            builder.download_speed(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 14: {
                        if (a == 10) {
                            builder.available_memory(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 11) {
                            builder.language_list(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.primary_language(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.device_tier(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 8) {
                            builder.year_class(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 10) {
                            builder.fingerprint_created_timestamp(e.v());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.fingerprint(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.browser_version(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 11) {
                            builder.browser_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.os_version(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.os_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.device_name(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.device_id(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.name(e.F());
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
        
        public void write(final e e, final Platform platform) throws IOException {
            e.X();
            if (platform.name != null) {
                e.O(1, (byte)11);
                e.W(platform.name);
                e.P();
            }
            if (platform.device_id != null) {
                e.O(2, (byte)11);
                e.W(platform.device_id);
                e.P();
            }
            if (platform.device_name != null) {
                e.O(3, (byte)11);
                e.W(platform.device_name);
                e.P();
            }
            if (platform.os_name != null) {
                e.O(4, (byte)11);
                e.W(platform.os_name);
                e.P();
            }
            if (platform.os_version != null) {
                e.O(5, (byte)11);
                e.W(platform.os_version);
                e.P();
            }
            if (platform.browser_name != null) {
                e.O(6, (byte)11);
                e.W(platform.browser_name);
                e.P();
            }
            if (platform.browser_version != null) {
                e.O(7, (byte)11);
                e.W(platform.browser_version);
                e.P();
            }
            if (platform.fingerprint != null) {
                e.O(8, (byte)11);
                e.W(platform.fingerprint);
                e.P();
            }
            if (platform.fingerprint_created_timestamp != null) {
                e.O(9, (byte)10);
                k.w(platform.fingerprint_created_timestamp, e);
            }
            if (platform.year_class != null) {
                e.O(10, (byte)8);
                aq2.a.x(platform.year_class, e);
            }
            if (platform.device_tier != null) {
                e.O(11, (byte)11);
                e.W(platform.device_tier);
                e.P();
            }
            if (platform.primary_language != null) {
                e.O(12, (byte)11);
                e.W(platform.primary_language);
                e.P();
            }
            if (platform.language_list != null) {
                e.O(13, (byte)11);
                e.W(platform.language_list);
                e.P();
            }
            if (platform.available_memory != null) {
                e.O(14, (byte)10);
                k.w(platform.available_memory, e);
            }
            if (platform.download_speed != null) {
                e.O(15, (byte)10);
                k.w(platform.download_speed, e);
            }
            if (platform.connection_type != null) {
                e.O(16, (byte)11);
                e.W(platform.connection_type);
                e.P();
            }
            if (platform.device_manufacturer != null) {
                e.O(17, (byte)11);
                e.W(platform.device_manufacturer);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Platform)o);
        }
    }
}
