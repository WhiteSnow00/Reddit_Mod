// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.util.Iterator;
import com.microsoft.thrifty.ThriftException;
import ft.c;
import b5.k;
import java.util.ArrayList;
import et.b;
import java.io.IOException;
import ft.e;
import java.util.Collections;
import java.util.List;
import et.a;

public final class PostRequirement
{
    public static final a<PostRequirement, Builder> ADAPTER;
    public final List<String> body_blacklisted_strings;
    public final List<String> body_regex_patterns;
    public final List<String> body_required_strings;
    public final String body_restriction_policy;
    public final Integer link_blacklisted_domains_length;
    public final Integer link_whitelisted_domains_length;
    public final Integer number_repost_frequency_days;
    public final Boolean require_post_flair;
    public final List<String> title_blacklisted_strings;
    public final List<String> title_regex_patterns;
    public final List<String> title_required_strings;
    public final Integer title_text_max_length;
    public final Integer title_text_min_length;
    
    static {
        ADAPTER = (a)new PostRequirementAdapter(null);
    }
    
    private PostRequirement(final Builder builder) {
        final List access$100 = Builder.access$100(builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$100 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.title_required_strings = unmodifiableList;
        List<String> unmodifiableList2;
        if (Builder.access$200(builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Builder.access$200(builder));
        }
        this.title_blacklisted_strings = unmodifiableList2;
        this.title_text_min_length = Builder.access$300(builder);
        this.title_text_max_length = Builder.access$400(builder);
        this.body_restriction_policy = Builder.access$500(builder);
        List<String> unmodifiableList3;
        if (Builder.access$600(builder) == null) {
            unmodifiableList3 = null;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)Builder.access$600(builder));
        }
        this.body_required_strings = unmodifiableList3;
        List<String> unmodifiableList4;
        if (Builder.access$700(builder) == null) {
            unmodifiableList4 = null;
        }
        else {
            unmodifiableList4 = Collections.unmodifiableList((List<? extends String>)Builder.access$700(builder));
        }
        this.body_blacklisted_strings = unmodifiableList4;
        this.link_whitelisted_domains_length = Builder.access$800(builder);
        this.link_blacklisted_domains_length = Builder.access$900(builder);
        this.number_repost_frequency_days = Builder.access$1000(builder);
        this.require_post_flair = Builder.access$1100(builder);
        List<String> unmodifiableList5;
        if (Builder.access$1200(builder) == null) {
            unmodifiableList5 = null;
        }
        else {
            unmodifiableList5 = Collections.unmodifiableList((List<? extends String>)Builder.access$1200(builder));
        }
        this.title_regex_patterns = unmodifiableList5;
        List<String> unmodifiableList6;
        if (Builder.access$1300(builder) == null) {
            unmodifiableList6 = list;
        }
        else {
            unmodifiableList6 = Collections.unmodifiableList((List<? extends String>)Builder.access$1300(builder));
        }
        this.body_regex_patterns = unmodifiableList6;
    }
    
    public PostRequirement(final Builder builder, final PostRequirement$1 object) {
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
        if (!(o instanceof PostRequirement)) {
            return false;
        }
        final PostRequirement postRequirement = (PostRequirement)o;
        final List<String> title_required_strings = this.title_required_strings;
        final List<String> title_required_strings2 = postRequirement.title_required_strings;
        if (title_required_strings == title_required_strings2 || (title_required_strings != null && title_required_strings.equals(title_required_strings2))) {
            final List<String> title_blacklisted_strings = this.title_blacklisted_strings;
            final List<String> title_blacklisted_strings2 = postRequirement.title_blacklisted_strings;
            if (title_blacklisted_strings == title_blacklisted_strings2 || (title_blacklisted_strings != null && title_blacklisted_strings.equals(title_blacklisted_strings2))) {
                final Integer title_text_min_length = this.title_text_min_length;
                final Integer title_text_min_length2 = postRequirement.title_text_min_length;
                if (title_text_min_length == title_text_min_length2 || (title_text_min_length != null && title_text_min_length.equals(title_text_min_length2))) {
                    final Integer title_text_max_length = this.title_text_max_length;
                    final Integer title_text_max_length2 = postRequirement.title_text_max_length;
                    if (title_text_max_length == title_text_max_length2 || (title_text_max_length != null && title_text_max_length.equals(title_text_max_length2))) {
                        final String body_restriction_policy = this.body_restriction_policy;
                        final String body_restriction_policy2 = postRequirement.body_restriction_policy;
                        if (body_restriction_policy == body_restriction_policy2 || (body_restriction_policy != null && body_restriction_policy.equals(body_restriction_policy2))) {
                            final List<String> body_required_strings = this.body_required_strings;
                            final List<String> body_required_strings2 = postRequirement.body_required_strings;
                            if (body_required_strings == body_required_strings2 || (body_required_strings != null && body_required_strings.equals(body_required_strings2))) {
                                final List<String> body_blacklisted_strings = this.body_blacklisted_strings;
                                final List<String> body_blacklisted_strings2 = postRequirement.body_blacklisted_strings;
                                if (body_blacklisted_strings == body_blacklisted_strings2 || (body_blacklisted_strings != null && body_blacklisted_strings.equals(body_blacklisted_strings2))) {
                                    final Integer link_whitelisted_domains_length = this.link_whitelisted_domains_length;
                                    final Integer link_whitelisted_domains_length2 = postRequirement.link_whitelisted_domains_length;
                                    if (link_whitelisted_domains_length == link_whitelisted_domains_length2 || (link_whitelisted_domains_length != null && link_whitelisted_domains_length.equals(link_whitelisted_domains_length2))) {
                                        final Integer link_blacklisted_domains_length = this.link_blacklisted_domains_length;
                                        final Integer link_blacklisted_domains_length2 = postRequirement.link_blacklisted_domains_length;
                                        if (link_blacklisted_domains_length == link_blacklisted_domains_length2 || (link_blacklisted_domains_length != null && link_blacklisted_domains_length.equals(link_blacklisted_domains_length2))) {
                                            final Integer number_repost_frequency_days = this.number_repost_frequency_days;
                                            final Integer number_repost_frequency_days2 = postRequirement.number_repost_frequency_days;
                                            if (number_repost_frequency_days == number_repost_frequency_days2 || (number_repost_frequency_days != null && number_repost_frequency_days.equals(number_repost_frequency_days2))) {
                                                final Boolean require_post_flair = this.require_post_flair;
                                                final Boolean require_post_flair2 = postRequirement.require_post_flair;
                                                if (require_post_flair == require_post_flair2 || (require_post_flair != null && require_post_flair.equals(require_post_flair2))) {
                                                    final List<String> title_regex_patterns = this.title_regex_patterns;
                                                    final List<String> title_regex_patterns2 = postRequirement.title_regex_patterns;
                                                    if (title_regex_patterns == title_regex_patterns2 || (title_regex_patterns != null && title_regex_patterns.equals(title_regex_patterns2))) {
                                                        final List<String> body_regex_patterns = this.body_regex_patterns;
                                                        final List<String> body_regex_patterns2 = postRequirement.body_regex_patterns;
                                                        boolean b2 = b;
                                                        if (body_regex_patterns == body_regex_patterns2) {
                                                            return b2;
                                                        }
                                                        if (body_regex_patterns != null && body_regex_patterns.equals(body_regex_patterns2)) {
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
        final List<String> title_required_strings = this.title_required_strings;
        int hashCode = 0;
        int hashCode2;
        if (title_required_strings == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title_required_strings.hashCode();
        }
        final List<String> title_blacklisted_strings = this.title_blacklisted_strings;
        int hashCode3;
        if (title_blacklisted_strings == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title_blacklisted_strings.hashCode();
        }
        final Integer title_text_min_length = this.title_text_min_length;
        int hashCode4;
        if (title_text_min_length == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = title_text_min_length.hashCode();
        }
        final Integer title_text_max_length = this.title_text_max_length;
        int hashCode5;
        if (title_text_max_length == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = title_text_max_length.hashCode();
        }
        final String body_restriction_policy = this.body_restriction_policy;
        int hashCode6;
        if (body_restriction_policy == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = body_restriction_policy.hashCode();
        }
        final List<String> body_required_strings = this.body_required_strings;
        int hashCode7;
        if (body_required_strings == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = body_required_strings.hashCode();
        }
        final List<String> body_blacklisted_strings = this.body_blacklisted_strings;
        int hashCode8;
        if (body_blacklisted_strings == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = body_blacklisted_strings.hashCode();
        }
        final Integer link_whitelisted_domains_length = this.link_whitelisted_domains_length;
        int hashCode9;
        if (link_whitelisted_domains_length == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = link_whitelisted_domains_length.hashCode();
        }
        final Integer link_blacklisted_domains_length = this.link_blacklisted_domains_length;
        int hashCode10;
        if (link_blacklisted_domains_length == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = link_blacklisted_domains_length.hashCode();
        }
        final Integer number_repost_frequency_days = this.number_repost_frequency_days;
        int hashCode11;
        if (number_repost_frequency_days == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = number_repost_frequency_days.hashCode();
        }
        final Boolean require_post_flair = this.require_post_flair;
        int hashCode12;
        if (require_post_flair == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = require_post_flair.hashCode();
        }
        final List<String> title_regex_patterns = this.title_regex_patterns;
        int hashCode13;
        if (title_regex_patterns == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = title_regex_patterns.hashCode();
        }
        final List<String> body_regex_patterns = this.body_regex_patterns;
        if (body_regex_patterns != null) {
            hashCode = body_regex_patterns.hashCode();
        }
        return (((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostRequirement{title_required_strings=");
        t.append(this.title_required_strings);
        t.append(", title_blacklisted_strings=");
        t.append(this.title_blacklisted_strings);
        t.append(", title_text_min_length=");
        t.append(this.title_text_min_length);
        t.append(", title_text_max_length=");
        t.append(this.title_text_max_length);
        t.append(", body_restriction_policy=");
        t.append(this.body_restriction_policy);
        t.append(", body_required_strings=");
        t.append(this.body_required_strings);
        t.append(", body_blacklisted_strings=");
        t.append(this.body_blacklisted_strings);
        t.append(", link_whitelisted_domains_length=");
        t.append(this.link_whitelisted_domains_length);
        t.append(", link_blacklisted_domains_length=");
        t.append(this.link_blacklisted_domains_length);
        t.append(", number_repost_frequency_days=");
        t.append(this.number_repost_frequency_days);
        t.append(", require_post_flair=");
        t.append(this.require_post_flair);
        t.append(", title_regex_patterns=");
        t.append(this.title_regex_patterns);
        t.append(", body_regex_patterns=");
        return a.s(t, (List)this.body_regex_patterns, "}");
    }
    
    public void write(final e e) throws IOException {
        PostRequirement.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<PostRequirement>
    {
        private List<String> body_blacklisted_strings;
        private List<String> body_regex_patterns;
        private List<String> body_required_strings;
        private String body_restriction_policy;
        private Integer link_blacklisted_domains_length;
        private Integer link_whitelisted_domains_length;
        private Integer number_repost_frequency_days;
        private Boolean require_post_flair;
        private List<String> title_blacklisted_strings;
        private List<String> title_regex_patterns;
        private List<String> title_required_strings;
        private Integer title_text_max_length;
        private Integer title_text_min_length;
        
        public Builder() {
        }
        
        public Builder(final PostRequirement postRequirement) {
            this.title_required_strings = postRequirement.title_required_strings;
            this.title_blacklisted_strings = postRequirement.title_blacklisted_strings;
            this.title_text_min_length = postRequirement.title_text_min_length;
            this.title_text_max_length = postRequirement.title_text_max_length;
            this.body_restriction_policy = postRequirement.body_restriction_policy;
            this.body_required_strings = postRequirement.body_required_strings;
            this.body_blacklisted_strings = postRequirement.body_blacklisted_strings;
            this.link_whitelisted_domains_length = postRequirement.link_whitelisted_domains_length;
            this.link_blacklisted_domains_length = postRequirement.link_blacklisted_domains_length;
            this.number_repost_frequency_days = postRequirement.number_repost_frequency_days;
            this.require_post_flair = postRequirement.require_post_flair;
            this.title_regex_patterns = postRequirement.title_regex_patterns;
            this.body_regex_patterns = postRequirement.body_regex_patterns;
        }
        
        public static List access$100(final Builder builder) {
            return builder.title_required_strings;
        }
        
        public static Integer access$1000(final Builder builder) {
            return builder.number_repost_frequency_days;
        }
        
        public static Boolean access$1100(final Builder builder) {
            return builder.require_post_flair;
        }
        
        public static List access$1200(final Builder builder) {
            return builder.title_regex_patterns;
        }
        
        public static List access$1300(final Builder builder) {
            return builder.body_regex_patterns;
        }
        
        public static List access$200(final Builder builder) {
            return builder.title_blacklisted_strings;
        }
        
        public static Integer access$300(final Builder builder) {
            return builder.title_text_min_length;
        }
        
        public static Integer access$400(final Builder builder) {
            return builder.title_text_max_length;
        }
        
        public static String access$500(final Builder builder) {
            return builder.body_restriction_policy;
        }
        
        public static List access$600(final Builder builder) {
            return builder.body_required_strings;
        }
        
        public static List access$700(final Builder builder) {
            return builder.body_blacklisted_strings;
        }
        
        public static Integer access$800(final Builder builder) {
            return builder.link_whitelisted_domains_length;
        }
        
        public static Integer access$900(final Builder builder) {
            return builder.link_blacklisted_domains_length;
        }
        
        public Builder body_blacklisted_strings(final List<String> body_blacklisted_strings) {
            this.body_blacklisted_strings = body_blacklisted_strings;
            return this;
        }
        
        public Builder body_regex_patterns(final List<String> body_regex_patterns) {
            this.body_regex_patterns = body_regex_patterns;
            return this;
        }
        
        public Builder body_required_strings(final List<String> body_required_strings) {
            this.body_required_strings = body_required_strings;
            return this;
        }
        
        public Builder body_restriction_policy(final String body_restriction_policy) {
            this.body_restriction_policy = body_restriction_policy;
            return this;
        }
        
        public PostRequirement build() {
            return new PostRequirement(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder link_blacklisted_domains_length(final Integer link_blacklisted_domains_length) {
            this.link_blacklisted_domains_length = link_blacklisted_domains_length;
            return this;
        }
        
        public Builder link_whitelisted_domains_length(final Integer link_whitelisted_domains_length) {
            this.link_whitelisted_domains_length = link_whitelisted_domains_length;
            return this;
        }
        
        public Builder number_repost_frequency_days(final Integer number_repost_frequency_days) {
            this.number_repost_frequency_days = number_repost_frequency_days;
            return this;
        }
        
        public Builder require_post_flair(final Boolean require_post_flair) {
            this.require_post_flair = require_post_flair;
            return this;
        }
        
        public void reset() {
            this.title_required_strings = null;
            this.title_blacklisted_strings = null;
            this.title_text_min_length = null;
            this.title_text_max_length = null;
            this.body_restriction_policy = null;
            this.body_required_strings = null;
            this.body_blacklisted_strings = null;
            this.link_whitelisted_domains_length = null;
            this.link_blacklisted_domains_length = null;
            this.number_repost_frequency_days = null;
            this.require_post_flair = null;
            this.title_regex_patterns = null;
            this.body_regex_patterns = null;
        }
        
        public Builder title_blacklisted_strings(final List<String> title_blacklisted_strings) {
            this.title_blacklisted_strings = title_blacklisted_strings;
            return this;
        }
        
        public Builder title_regex_patterns(final List<String> title_regex_patterns) {
            this.title_regex_patterns = title_regex_patterns;
            return this;
        }
        
        public Builder title_required_strings(final List<String> title_required_strings) {
            this.title_required_strings = title_required_strings;
            return this;
        }
        
        public Builder title_text_max_length(final Integer title_text_max_length) {
            this.title_text_max_length = title_text_max_length;
            return this;
        }
        
        public Builder title_text_min_length(final Integer title_text_min_length) {
            this.title_text_min_length = title_text_min_length;
            return this;
        }
    }
    
    public static final class PostRequirementAdapter implements a<PostRequirement, Builder>
    {
        private PostRequirementAdapter() {
        }
        
        public PostRequirementAdapter(final PostRequirement$1 object) {
            this();
        }
        
        public PostRequirement read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public PostRequirement read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                final int n = 0;
                final int n2 = 0;
                final int n3 = 0;
                final int n4 = 0;
                final int n5 = 0;
                int i = 0;
                switch (b) {
                    default: {
                        ht.a.a(e, a);
                        break;
                    }
                    case 13: {
                        if (a == 15) {
                            c w;
                            ArrayList list;
                            for (w = e.w(), list = new ArrayList(w.b); i < w.b; i = k.f(e, list, i, 1)) {}
                            e.x();
                            builder.body_regex_patterns((List<String>)list);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 15) {
                            final c w2 = e.w();
                            final ArrayList list2 = new ArrayList(w2.b);
                            for (int j = n; j < w2.b; j = k.f(e, list2, j, 1)) {}
                            e.x();
                            builder.title_regex_patterns((List<String>)list2);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 2) {
                            builder.require_post_flair(e.b());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 8) {
                            builder.number_repost_frequency_days(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 8) {
                            builder.link_blacklisted_domains_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 8) {
                            builder.link_whitelisted_domains_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 15) {
                            final c w3 = e.w();
                            final ArrayList list3 = new ArrayList(w3.b);
                            for (int k = n2; k < w3.b; k = k.f(e, list3, k, 1)) {}
                            e.x();
                            builder.body_blacklisted_strings((List<String>)list3);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 15) {
                            final c w4 = e.w();
                            final ArrayList list4 = new ArrayList(w4.b);
                            for (int l = n3; l < w4.b; l = k.f(e, list4, l, 1)) {}
                            e.x();
                            builder.body_required_strings((List<String>)list4);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.body_restriction_policy(e.F());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 8) {
                            builder.title_text_max_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 8) {
                            builder.title_text_min_length(e.t());
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 15) {
                            final c w5 = e.w();
                            final ArrayList list5 = new ArrayList(w5.b);
                            for (int f = n4; f < w5.b; f = k.f(e, list5, f, 1)) {}
                            e.x();
                            builder.title_blacklisted_strings((List<String>)list5);
                            break;
                        }
                        ht.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 15) {
                            final c w6 = e.w();
                            final ArrayList list6 = new ArrayList(w6.b);
                            for (int f2 = n5; f2 < w6.b; f2 = k.f(e, list6, f2, 1)) {}
                            e.x();
                            builder.title_required_strings((List<String>)list6);
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
        
        public void write(final e e, final PostRequirement postRequirement) throws IOException {
            e.X();
            if (postRequirement.title_required_strings != null) {
                e.O(1, (byte)15);
                e.U((byte)11, postRequirement.title_required_strings.size());
                final Iterator<String> iterator = postRequirement.title_required_strings.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (postRequirement.title_blacklisted_strings != null) {
                e.O(2, (byte)15);
                e.U((byte)11, postRequirement.title_blacklisted_strings.size());
                final Iterator<String> iterator2 = postRequirement.title_blacklisted_strings.iterator();
                while (iterator2.hasNext()) {
                    e.W((String)iterator2.next());
                }
                e.V();
                e.P();
            }
            if (postRequirement.title_text_min_length != null) {
                e.O(3, (byte)8);
                aq2.a.x(postRequirement.title_text_min_length, e);
            }
            if (postRequirement.title_text_max_length != null) {
                e.O(4, (byte)8);
                aq2.a.x(postRequirement.title_text_max_length, e);
            }
            if (postRequirement.body_restriction_policy != null) {
                e.O(5, (byte)11);
                e.W(postRequirement.body_restriction_policy);
                e.P();
            }
            if (postRequirement.body_required_strings != null) {
                e.O(6, (byte)15);
                e.U((byte)11, postRequirement.body_required_strings.size());
                final Iterator<String> iterator3 = postRequirement.body_required_strings.iterator();
                while (iterator3.hasNext()) {
                    e.W((String)iterator3.next());
                }
                e.V();
                e.P();
            }
            if (postRequirement.body_blacklisted_strings != null) {
                e.O(7, (byte)15);
                e.U((byte)11, postRequirement.body_blacklisted_strings.size());
                final Iterator<String> iterator4 = postRequirement.body_blacklisted_strings.iterator();
                while (iterator4.hasNext()) {
                    e.W((String)iterator4.next());
                }
                e.V();
                e.P();
            }
            if (postRequirement.link_whitelisted_domains_length != null) {
                e.O(8, (byte)8);
                aq2.a.x(postRequirement.link_whitelisted_domains_length, e);
            }
            if (postRequirement.link_blacklisted_domains_length != null) {
                e.O(9, (byte)8);
                aq2.a.x(postRequirement.link_blacklisted_domains_length, e);
            }
            if (postRequirement.number_repost_frequency_days != null) {
                e.O(10, (byte)8);
                aq2.a.x(postRequirement.number_repost_frequency_days, e);
            }
            if (postRequirement.require_post_flair != null) {
                e.O(11, (byte)2);
                android.support.v4.media.a.A(postRequirement.require_post_flair, e);
            }
            if (postRequirement.title_regex_patterns != null) {
                e.O(12, (byte)15);
                e.U((byte)11, postRequirement.title_regex_patterns.size());
                final Iterator<String> iterator5 = postRequirement.title_regex_patterns.iterator();
                while (iterator5.hasNext()) {
                    e.W((String)iterator5.next());
                }
                e.V();
                e.P();
            }
            if (postRequirement.body_regex_patterns != null) {
                e.O(13, (byte)15);
                e.U((byte)11, postRequirement.body_regex_patterns.size());
                final Iterator<String> iterator6 = postRequirement.body_regex_patterns.iterator();
                while (iterator6.hasNext()) {
                    e.W((String)iterator6.next());
                }
                e.V();
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (PostRequirement)o);
        }
    }
}
