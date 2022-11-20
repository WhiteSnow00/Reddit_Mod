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

public final class Perspective
{
    public static final a<Perspective, Builder> ADAPTER;
    public final Double attack_on_author;
    public final Double attack_on_commenter;
    public final List<String> collapse_reasons;
    public final Double flirtation;
    public final String id;
    public final Double identity_attack;
    public final Double incoherent;
    public final Double inflammatory;
    public final Double insult;
    public final Double likely_to_reject;
    public final Double max_attack_on_author;
    public final Double max_attack_on_commenter;
    public final Double max_flirtation;
    public final Double max_identity_attack;
    public final Double max_incoherent;
    public final Double max_inflammatory;
    public final Double max_insult;
    public final Double max_likely_to_reject;
    public final Double max_obscene;
    public final Double max_profanity;
    public final Double max_severe_toxicity;
    public final Double max_sexually_explicit;
    public final Double max_spam;
    public final Double max_threat;
    public final Double max_toxicity;
    public final Double max_unsubstantial;
    public final Double obscene;
    public final Double profanity;
    public final Double severe_toxicity;
    public final Double sexually_explicit;
    public final Double spam;
    public final Double threat;
    public final Double toxicity;
    public final Double unsubstantial;
    
    static {
        ADAPTER = (a)new PerspectiveAdapter(null);
    }
    
    private Perspective(final Builder builder) {
        List<String> unmodifiableList;
        if (Builder.access$100(builder) == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Builder.access$100(builder));
        }
        this.collapse_reasons = unmodifiableList;
        this.toxicity = Builder.access$200(builder);
        this.severe_toxicity = Builder.access$300(builder);
        this.insult = Builder.access$400(builder);
        this.profanity = Builder.access$500(builder);
        this.sexually_explicit = Builder.access$600(builder);
        this.threat = Builder.access$700(builder);
        this.flirtation = Builder.access$800(builder);
        this.attack_on_author = Builder.access$900(builder);
        this.attack_on_commenter = Builder.access$1000(builder);
        this.incoherent = Builder.access$1100(builder);
        this.inflammatory = Builder.access$1200(builder);
        this.likely_to_reject = Builder.access$1300(builder);
        this.obscene = Builder.access$1400(builder);
        this.spam = Builder.access$1500(builder);
        this.unsubstantial = Builder.access$1600(builder);
        this.identity_attack = Builder.access$1700(builder);
        this.id = Builder.access$1800(builder);
        this.max_toxicity = Builder.access$1900(builder);
        this.max_severe_toxicity = Builder.access$2000(builder);
        this.max_insult = Builder.access$2100(builder);
        this.max_profanity = Builder.access$2200(builder);
        this.max_sexually_explicit = Builder.access$2300(builder);
        this.max_threat = Builder.access$2400(builder);
        this.max_flirtation = Builder.access$2500(builder);
        this.max_attack_on_author = Builder.access$2600(builder);
        this.max_attack_on_commenter = Builder.access$2700(builder);
        this.max_incoherent = Builder.access$2800(builder);
        this.max_inflammatory = Builder.access$2900(builder);
        this.max_likely_to_reject = Builder.access$3000(builder);
        this.max_obscene = Builder.access$3100(builder);
        this.max_spam = Builder.access$3200(builder);
        this.max_unsubstantial = Builder.access$3300(builder);
        this.max_identity_attack = Builder.access$3400(builder);
    }
    
    public Perspective(final Builder builder, final Perspective$1 object) {
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
        if (!(o instanceof Perspective)) {
            return false;
        }
        final Perspective perspective = (Perspective)o;
        final List<String> collapse_reasons = this.collapse_reasons;
        final List<String> collapse_reasons2 = perspective.collapse_reasons;
        if (collapse_reasons == collapse_reasons2 || (collapse_reasons != null && collapse_reasons.equals(collapse_reasons2))) {
            final Double toxicity = this.toxicity;
            final Double toxicity2 = perspective.toxicity;
            if (toxicity == toxicity2 || (toxicity != null && toxicity.equals(toxicity2))) {
                final Double severe_toxicity = this.severe_toxicity;
                final Double severe_toxicity2 = perspective.severe_toxicity;
                if (severe_toxicity == severe_toxicity2 || (severe_toxicity != null && severe_toxicity.equals(severe_toxicity2))) {
                    final Double insult = this.insult;
                    final Double insult2 = perspective.insult;
                    if (insult == insult2 || (insult != null && insult.equals(insult2))) {
                        final Double profanity = this.profanity;
                        final Double profanity2 = perspective.profanity;
                        if (profanity == profanity2 || (profanity != null && profanity.equals(profanity2))) {
                            final Double sexually_explicit = this.sexually_explicit;
                            final Double sexually_explicit2 = perspective.sexually_explicit;
                            if (sexually_explicit == sexually_explicit2 || (sexually_explicit != null && sexually_explicit.equals(sexually_explicit2))) {
                                final Double threat = this.threat;
                                final Double threat2 = perspective.threat;
                                if (threat == threat2 || (threat != null && threat.equals(threat2))) {
                                    final Double flirtation = this.flirtation;
                                    final Double flirtation2 = perspective.flirtation;
                                    if (flirtation == flirtation2 || (flirtation != null && flirtation.equals(flirtation2))) {
                                        final Double attack_on_author = this.attack_on_author;
                                        final Double attack_on_author2 = perspective.attack_on_author;
                                        if (attack_on_author == attack_on_author2 || (attack_on_author != null && attack_on_author.equals(attack_on_author2))) {
                                            final Double attack_on_commenter = this.attack_on_commenter;
                                            final Double attack_on_commenter2 = perspective.attack_on_commenter;
                                            if (attack_on_commenter == attack_on_commenter2 || (attack_on_commenter != null && attack_on_commenter.equals(attack_on_commenter2))) {
                                                final Double incoherent = this.incoherent;
                                                final Double incoherent2 = perspective.incoherent;
                                                if (incoherent == incoherent2 || (incoherent != null && incoherent.equals(incoherent2))) {
                                                    final Double inflammatory = this.inflammatory;
                                                    final Double inflammatory2 = perspective.inflammatory;
                                                    if (inflammatory == inflammatory2 || (inflammatory != null && inflammatory.equals(inflammatory2))) {
                                                        final Double likely_to_reject = this.likely_to_reject;
                                                        final Double likely_to_reject2 = perspective.likely_to_reject;
                                                        if (likely_to_reject == likely_to_reject2 || (likely_to_reject != null && likely_to_reject.equals(likely_to_reject2))) {
                                                            final Double obscene = this.obscene;
                                                            final Double obscene2 = perspective.obscene;
                                                            if (obscene == obscene2 || (obscene != null && obscene.equals(obscene2))) {
                                                                final Double spam = this.spam;
                                                                final Double spam2 = perspective.spam;
                                                                if (spam == spam2 || (spam != null && spam.equals(spam2))) {
                                                                    final Double unsubstantial = this.unsubstantial;
                                                                    final Double unsubstantial2 = perspective.unsubstantial;
                                                                    if (unsubstantial == unsubstantial2 || (unsubstantial != null && unsubstantial.equals(unsubstantial2))) {
                                                                        final Double identity_attack = this.identity_attack;
                                                                        final Double identity_attack2 = perspective.identity_attack;
                                                                        if (identity_attack == identity_attack2 || (identity_attack != null && identity_attack.equals(identity_attack2))) {
                                                                            final String id = this.id;
                                                                            final String id2 = perspective.id;
                                                                            if (id == id2 || (id != null && id.equals(id2))) {
                                                                                final Double max_toxicity = this.max_toxicity;
                                                                                final Double max_toxicity2 = perspective.max_toxicity;
                                                                                if (max_toxicity == max_toxicity2 || (max_toxicity != null && max_toxicity.equals(max_toxicity2))) {
                                                                                    final Double max_severe_toxicity = this.max_severe_toxicity;
                                                                                    final Double max_severe_toxicity2 = perspective.max_severe_toxicity;
                                                                                    if (max_severe_toxicity == max_severe_toxicity2 || (max_severe_toxicity != null && max_severe_toxicity.equals(max_severe_toxicity2))) {
                                                                                        final Double max_insult = this.max_insult;
                                                                                        final Double max_insult2 = perspective.max_insult;
                                                                                        if (max_insult == max_insult2 || (max_insult != null && max_insult.equals(max_insult2))) {
                                                                                            final Double max_profanity = this.max_profanity;
                                                                                            final Double max_profanity2 = perspective.max_profanity;
                                                                                            if (max_profanity == max_profanity2 || (max_profanity != null && max_profanity.equals(max_profanity2))) {
                                                                                                final Double max_sexually_explicit = this.max_sexually_explicit;
                                                                                                final Double max_sexually_explicit2 = perspective.max_sexually_explicit;
                                                                                                if (max_sexually_explicit == max_sexually_explicit2 || (max_sexually_explicit != null && max_sexually_explicit.equals(max_sexually_explicit2))) {
                                                                                                    final Double max_threat = this.max_threat;
                                                                                                    final Double max_threat2 = perspective.max_threat;
                                                                                                    if (max_threat == max_threat2 || (max_threat != null && max_threat.equals(max_threat2))) {
                                                                                                        final Double max_flirtation = this.max_flirtation;
                                                                                                        final Double max_flirtation2 = perspective.max_flirtation;
                                                                                                        if (max_flirtation == max_flirtation2 || (max_flirtation != null && max_flirtation.equals(max_flirtation2))) {
                                                                                                            final Double max_attack_on_author = this.max_attack_on_author;
                                                                                                            final Double max_attack_on_author2 = perspective.max_attack_on_author;
                                                                                                            if (max_attack_on_author == max_attack_on_author2 || (max_attack_on_author != null && max_attack_on_author.equals(max_attack_on_author2))) {
                                                                                                                final Double max_attack_on_commenter = this.max_attack_on_commenter;
                                                                                                                final Double max_attack_on_commenter2 = perspective.max_attack_on_commenter;
                                                                                                                if (max_attack_on_commenter == max_attack_on_commenter2 || (max_attack_on_commenter != null && max_attack_on_commenter.equals(max_attack_on_commenter2))) {
                                                                                                                    final Double max_incoherent = this.max_incoherent;
                                                                                                                    final Double max_incoherent2 = perspective.max_incoherent;
                                                                                                                    if (max_incoherent == max_incoherent2 || (max_incoherent != null && max_incoherent.equals(max_incoherent2))) {
                                                                                                                        final Double max_inflammatory = this.max_inflammatory;
                                                                                                                        final Double max_inflammatory2 = perspective.max_inflammatory;
                                                                                                                        if (max_inflammatory == max_inflammatory2 || (max_inflammatory != null && max_inflammatory.equals(max_inflammatory2))) {
                                                                                                                            final Double max_likely_to_reject = this.max_likely_to_reject;
                                                                                                                            final Double max_likely_to_reject2 = perspective.max_likely_to_reject;
                                                                                                                            if (max_likely_to_reject == max_likely_to_reject2 || (max_likely_to_reject != null && max_likely_to_reject.equals(max_likely_to_reject2))) {
                                                                                                                                final Double max_obscene = this.max_obscene;
                                                                                                                                final Double max_obscene2 = perspective.max_obscene;
                                                                                                                                if (max_obscene == max_obscene2 || (max_obscene != null && max_obscene.equals(max_obscene2))) {
                                                                                                                                    final Double max_spam = this.max_spam;
                                                                                                                                    final Double max_spam2 = perspective.max_spam;
                                                                                                                                    if (max_spam == max_spam2 || (max_spam != null && max_spam.equals(max_spam2))) {
                                                                                                                                        final Double max_unsubstantial = this.max_unsubstantial;
                                                                                                                                        final Double max_unsubstantial2 = perspective.max_unsubstantial;
                                                                                                                                        if (max_unsubstantial == max_unsubstantial2 || (max_unsubstantial != null && max_unsubstantial.equals(max_unsubstantial2))) {
                                                                                                                                            final Double max_identity_attack = this.max_identity_attack;
                                                                                                                                            final Double max_identity_attack2 = perspective.max_identity_attack;
                                                                                                                                            boolean b2 = b;
                                                                                                                                            if (max_identity_attack == max_identity_attack2) {
                                                                                                                                                return b2;
                                                                                                                                            }
                                                                                                                                            if (max_identity_attack != null && max_identity_attack.equals(max_identity_attack2)) {
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
        return false;
    }
    
    @Override
    public int hashCode() {
        final List<String> collapse_reasons = this.collapse_reasons;
        int hashCode = 0;
        int hashCode2;
        if (collapse_reasons == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = collapse_reasons.hashCode();
        }
        final Double toxicity = this.toxicity;
        int hashCode3;
        if (toxicity == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = toxicity.hashCode();
        }
        final Double severe_toxicity = this.severe_toxicity;
        int hashCode4;
        if (severe_toxicity == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = severe_toxicity.hashCode();
        }
        final Double insult = this.insult;
        int hashCode5;
        if (insult == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = insult.hashCode();
        }
        final Double profanity = this.profanity;
        int hashCode6;
        if (profanity == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = profanity.hashCode();
        }
        final Double sexually_explicit = this.sexually_explicit;
        int hashCode7;
        if (sexually_explicit == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = sexually_explicit.hashCode();
        }
        final Double threat = this.threat;
        int hashCode8;
        if (threat == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = threat.hashCode();
        }
        final Double flirtation = this.flirtation;
        int hashCode9;
        if (flirtation == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = flirtation.hashCode();
        }
        final Double attack_on_author = this.attack_on_author;
        int hashCode10;
        if (attack_on_author == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = attack_on_author.hashCode();
        }
        final Double attack_on_commenter = this.attack_on_commenter;
        int hashCode11;
        if (attack_on_commenter == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = attack_on_commenter.hashCode();
        }
        final Double incoherent = this.incoherent;
        int hashCode12;
        if (incoherent == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = incoherent.hashCode();
        }
        final Double inflammatory = this.inflammatory;
        int hashCode13;
        if (inflammatory == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = inflammatory.hashCode();
        }
        final Double likely_to_reject = this.likely_to_reject;
        int hashCode14;
        if (likely_to_reject == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = likely_to_reject.hashCode();
        }
        final Double obscene = this.obscene;
        int hashCode15;
        if (obscene == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = obscene.hashCode();
        }
        final Double spam = this.spam;
        int hashCode16;
        if (spam == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = spam.hashCode();
        }
        final Double unsubstantial = this.unsubstantial;
        int hashCode17;
        if (unsubstantial == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = unsubstantial.hashCode();
        }
        final Double identity_attack = this.identity_attack;
        int hashCode18;
        if (identity_attack == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = identity_attack.hashCode();
        }
        final String id = this.id;
        int hashCode19;
        if (id == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = id.hashCode();
        }
        final Double max_toxicity = this.max_toxicity;
        int hashCode20;
        if (max_toxicity == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = max_toxicity.hashCode();
        }
        final Double max_severe_toxicity = this.max_severe_toxicity;
        int hashCode21;
        if (max_severe_toxicity == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = max_severe_toxicity.hashCode();
        }
        final Double max_insult = this.max_insult;
        int hashCode22;
        if (max_insult == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = max_insult.hashCode();
        }
        final Double max_profanity = this.max_profanity;
        int hashCode23;
        if (max_profanity == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = max_profanity.hashCode();
        }
        final Double max_sexually_explicit = this.max_sexually_explicit;
        int hashCode24;
        if (max_sexually_explicit == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = max_sexually_explicit.hashCode();
        }
        final Double max_threat = this.max_threat;
        int hashCode25;
        if (max_threat == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = max_threat.hashCode();
        }
        final Double max_flirtation = this.max_flirtation;
        int hashCode26;
        if (max_flirtation == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = max_flirtation.hashCode();
        }
        final Double max_attack_on_author = this.max_attack_on_author;
        int hashCode27;
        if (max_attack_on_author == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = max_attack_on_author.hashCode();
        }
        final Double max_attack_on_commenter = this.max_attack_on_commenter;
        int hashCode28;
        if (max_attack_on_commenter == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = max_attack_on_commenter.hashCode();
        }
        final Double max_incoherent = this.max_incoherent;
        int hashCode29;
        if (max_incoherent == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = max_incoherent.hashCode();
        }
        final Double max_inflammatory = this.max_inflammatory;
        int hashCode30;
        if (max_inflammatory == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = max_inflammatory.hashCode();
        }
        final Double max_likely_to_reject = this.max_likely_to_reject;
        int hashCode31;
        if (max_likely_to_reject == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = max_likely_to_reject.hashCode();
        }
        final Double max_obscene = this.max_obscene;
        int hashCode32;
        if (max_obscene == null) {
            hashCode32 = 0;
        }
        else {
            hashCode32 = max_obscene.hashCode();
        }
        final Double max_spam = this.max_spam;
        int hashCode33;
        if (max_spam == null) {
            hashCode33 = 0;
        }
        else {
            hashCode33 = max_spam.hashCode();
        }
        final Double max_unsubstantial = this.max_unsubstantial;
        int hashCode34;
        if (max_unsubstantial == null) {
            hashCode34 = 0;
        }
        else {
            hashCode34 = max_unsubstantial.hashCode();
        }
        final Double max_identity_attack = this.max_identity_attack;
        if (max_identity_attack != null) {
            hashCode = max_identity_attack.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode26) * -2128831035 ^ hashCode27) * -2128831035 ^ hashCode28) * -2128831035 ^ hashCode29) * -2128831035 ^ hashCode30) * -2128831035 ^ hashCode31) * -2128831035 ^ hashCode32) * -2128831035 ^ hashCode33) * -2128831035 ^ hashCode34) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Perspective{collapse_reasons=");
        t.append(this.collapse_reasons);
        t.append(", toxicity=");
        t.append(this.toxicity);
        t.append(", severe_toxicity=");
        t.append(this.severe_toxicity);
        t.append(", insult=");
        t.append(this.insult);
        t.append(", profanity=");
        t.append(this.profanity);
        t.append(", sexually_explicit=");
        t.append(this.sexually_explicit);
        t.append(", threat=");
        t.append(this.threat);
        t.append(", flirtation=");
        t.append(this.flirtation);
        t.append(", attack_on_author=");
        t.append(this.attack_on_author);
        t.append(", attack_on_commenter=");
        t.append(this.attack_on_commenter);
        t.append(", incoherent=");
        t.append(this.incoherent);
        t.append(", inflammatory=");
        t.append(this.inflammatory);
        t.append(", likely_to_reject=");
        t.append(this.likely_to_reject);
        t.append(", obscene=");
        t.append(this.obscene);
        t.append(", spam=");
        t.append(this.spam);
        t.append(", unsubstantial=");
        t.append(this.unsubstantial);
        t.append(", identity_attack=");
        t.append(this.identity_attack);
        t.append(", id=");
        t.append(this.id);
        t.append(", max_toxicity=");
        t.append(this.max_toxicity);
        t.append(", max_severe_toxicity=");
        t.append(this.max_severe_toxicity);
        t.append(", max_insult=");
        t.append(this.max_insult);
        t.append(", max_profanity=");
        t.append(this.max_profanity);
        t.append(", max_sexually_explicit=");
        t.append(this.max_sexually_explicit);
        t.append(", max_threat=");
        t.append(this.max_threat);
        t.append(", max_flirtation=");
        t.append(this.max_flirtation);
        t.append(", max_attack_on_author=");
        t.append(this.max_attack_on_author);
        t.append(", max_attack_on_commenter=");
        t.append(this.max_attack_on_commenter);
        t.append(", max_incoherent=");
        t.append(this.max_incoherent);
        t.append(", max_inflammatory=");
        t.append(this.max_inflammatory);
        t.append(", max_likely_to_reject=");
        t.append(this.max_likely_to_reject);
        t.append(", max_obscene=");
        t.append(this.max_obscene);
        t.append(", max_spam=");
        t.append(this.max_spam);
        t.append(", max_unsubstantial=");
        t.append(this.max_unsubstantial);
        t.append(", max_identity_attack=");
        t.append(this.max_identity_attack);
        t.append("}");
        return t.toString();
    }
    
    public void write(final e e) throws IOException {
        Perspective.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Perspective>
    {
        private Double attack_on_author;
        private Double attack_on_commenter;
        private List<String> collapse_reasons;
        private Double flirtation;
        private String id;
        private Double identity_attack;
        private Double incoherent;
        private Double inflammatory;
        private Double insult;
        private Double likely_to_reject;
        private Double max_attack_on_author;
        private Double max_attack_on_commenter;
        private Double max_flirtation;
        private Double max_identity_attack;
        private Double max_incoherent;
        private Double max_inflammatory;
        private Double max_insult;
        private Double max_likely_to_reject;
        private Double max_obscene;
        private Double max_profanity;
        private Double max_severe_toxicity;
        private Double max_sexually_explicit;
        private Double max_spam;
        private Double max_threat;
        private Double max_toxicity;
        private Double max_unsubstantial;
        private Double obscene;
        private Double profanity;
        private Double severe_toxicity;
        private Double sexually_explicit;
        private Double spam;
        private Double threat;
        private Double toxicity;
        private Double unsubstantial;
        
        public Builder() {
        }
        
        public Builder(final Perspective perspective) {
            this.collapse_reasons = perspective.collapse_reasons;
            this.toxicity = perspective.toxicity;
            this.severe_toxicity = perspective.severe_toxicity;
            this.insult = perspective.insult;
            this.profanity = perspective.profanity;
            this.sexually_explicit = perspective.sexually_explicit;
            this.threat = perspective.threat;
            this.flirtation = perspective.flirtation;
            this.attack_on_author = perspective.attack_on_author;
            this.attack_on_commenter = perspective.attack_on_commenter;
            this.incoherent = perspective.incoherent;
            this.inflammatory = perspective.inflammatory;
            this.likely_to_reject = perspective.likely_to_reject;
            this.obscene = perspective.obscene;
            this.spam = perspective.spam;
            this.unsubstantial = perspective.unsubstantial;
            this.identity_attack = perspective.identity_attack;
            this.id = perspective.id;
            this.max_toxicity = perspective.max_toxicity;
            this.max_severe_toxicity = perspective.max_severe_toxicity;
            this.max_insult = perspective.max_insult;
            this.max_profanity = perspective.max_profanity;
            this.max_sexually_explicit = perspective.max_sexually_explicit;
            this.max_threat = perspective.max_threat;
            this.max_flirtation = perspective.max_flirtation;
            this.max_attack_on_author = perspective.max_attack_on_author;
            this.max_attack_on_commenter = perspective.max_attack_on_commenter;
            this.max_incoherent = perspective.max_incoherent;
            this.max_inflammatory = perspective.max_inflammatory;
            this.max_likely_to_reject = perspective.max_likely_to_reject;
            this.max_obscene = perspective.max_obscene;
            this.max_spam = perspective.max_spam;
            this.max_unsubstantial = perspective.max_unsubstantial;
            this.max_identity_attack = perspective.max_identity_attack;
        }
        
        public static List access$100(final Builder builder) {
            return builder.collapse_reasons;
        }
        
        public static Double access$1000(final Builder builder) {
            return builder.attack_on_commenter;
        }
        
        public static Double access$1100(final Builder builder) {
            return builder.incoherent;
        }
        
        public static Double access$1200(final Builder builder) {
            return builder.inflammatory;
        }
        
        public static Double access$1300(final Builder builder) {
            return builder.likely_to_reject;
        }
        
        public static Double access$1400(final Builder builder) {
            return builder.obscene;
        }
        
        public static Double access$1500(final Builder builder) {
            return builder.spam;
        }
        
        public static Double access$1600(final Builder builder) {
            return builder.unsubstantial;
        }
        
        public static Double access$1700(final Builder builder) {
            return builder.identity_attack;
        }
        
        public static String access$1800(final Builder builder) {
            return builder.id;
        }
        
        public static Double access$1900(final Builder builder) {
            return builder.max_toxicity;
        }
        
        public static Double access$200(final Builder builder) {
            return builder.toxicity;
        }
        
        public static Double access$2000(final Builder builder) {
            return builder.max_severe_toxicity;
        }
        
        public static Double access$2100(final Builder builder) {
            return builder.max_insult;
        }
        
        public static Double access$2200(final Builder builder) {
            return builder.max_profanity;
        }
        
        public static Double access$2300(final Builder builder) {
            return builder.max_sexually_explicit;
        }
        
        public static Double access$2400(final Builder builder) {
            return builder.max_threat;
        }
        
        public static Double access$2500(final Builder builder) {
            return builder.max_flirtation;
        }
        
        public static Double access$2600(final Builder builder) {
            return builder.max_attack_on_author;
        }
        
        public static Double access$2700(final Builder builder) {
            return builder.max_attack_on_commenter;
        }
        
        public static Double access$2800(final Builder builder) {
            return builder.max_incoherent;
        }
        
        public static Double access$2900(final Builder builder) {
            return builder.max_inflammatory;
        }
        
        public static Double access$300(final Builder builder) {
            return builder.severe_toxicity;
        }
        
        public static Double access$3000(final Builder builder) {
            return builder.max_likely_to_reject;
        }
        
        public static Double access$3100(final Builder builder) {
            return builder.max_obscene;
        }
        
        public static Double access$3200(final Builder builder) {
            return builder.max_spam;
        }
        
        public static Double access$3300(final Builder builder) {
            return builder.max_unsubstantial;
        }
        
        public static Double access$3400(final Builder builder) {
            return builder.max_identity_attack;
        }
        
        public static Double access$400(final Builder builder) {
            return builder.insult;
        }
        
        public static Double access$500(final Builder builder) {
            return builder.profanity;
        }
        
        public static Double access$600(final Builder builder) {
            return builder.sexually_explicit;
        }
        
        public static Double access$700(final Builder builder) {
            return builder.threat;
        }
        
        public static Double access$800(final Builder builder) {
            return builder.flirtation;
        }
        
        public static Double access$900(final Builder builder) {
            return builder.attack_on_author;
        }
        
        public Builder attack_on_author(final Double attack_on_author) {
            this.attack_on_author = attack_on_author;
            return this;
        }
        
        public Builder attack_on_commenter(final Double attack_on_commenter) {
            this.attack_on_commenter = attack_on_commenter;
            return this;
        }
        
        public Perspective build() {
            return new Perspective(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder collapse_reasons(final List<String> collapse_reasons) {
            this.collapse_reasons = collapse_reasons;
            return this;
        }
        
        public Builder flirtation(final Double flirtation) {
            this.flirtation = flirtation;
            return this;
        }
        
        public Builder id(final String id) {
            this.id = id;
            return this;
        }
        
        public Builder identity_attack(final Double identity_attack) {
            this.identity_attack = identity_attack;
            return this;
        }
        
        public Builder incoherent(final Double incoherent) {
            this.incoherent = incoherent;
            return this;
        }
        
        public Builder inflammatory(final Double inflammatory) {
            this.inflammatory = inflammatory;
            return this;
        }
        
        public Builder insult(final Double insult) {
            this.insult = insult;
            return this;
        }
        
        public Builder likely_to_reject(final Double likely_to_reject) {
            this.likely_to_reject = likely_to_reject;
            return this;
        }
        
        public Builder max_attack_on_author(final Double max_attack_on_author) {
            this.max_attack_on_author = max_attack_on_author;
            return this;
        }
        
        public Builder max_attack_on_commenter(final Double max_attack_on_commenter) {
            this.max_attack_on_commenter = max_attack_on_commenter;
            return this;
        }
        
        public Builder max_flirtation(final Double max_flirtation) {
            this.max_flirtation = max_flirtation;
            return this;
        }
        
        public Builder max_identity_attack(final Double max_identity_attack) {
            this.max_identity_attack = max_identity_attack;
            return this;
        }
        
        public Builder max_incoherent(final Double max_incoherent) {
            this.max_incoherent = max_incoherent;
            return this;
        }
        
        public Builder max_inflammatory(final Double max_inflammatory) {
            this.max_inflammatory = max_inflammatory;
            return this;
        }
        
        public Builder max_insult(final Double max_insult) {
            this.max_insult = max_insult;
            return this;
        }
        
        public Builder max_likely_to_reject(final Double max_likely_to_reject) {
            this.max_likely_to_reject = max_likely_to_reject;
            return this;
        }
        
        public Builder max_obscene(final Double max_obscene) {
            this.max_obscene = max_obscene;
            return this;
        }
        
        public Builder max_profanity(final Double max_profanity) {
            this.max_profanity = max_profanity;
            return this;
        }
        
        public Builder max_severe_toxicity(final Double max_severe_toxicity) {
            this.max_severe_toxicity = max_severe_toxicity;
            return this;
        }
        
        public Builder max_sexually_explicit(final Double max_sexually_explicit) {
            this.max_sexually_explicit = max_sexually_explicit;
            return this;
        }
        
        public Builder max_spam(final Double max_spam) {
            this.max_spam = max_spam;
            return this;
        }
        
        public Builder max_threat(final Double max_threat) {
            this.max_threat = max_threat;
            return this;
        }
        
        public Builder max_toxicity(final Double max_toxicity) {
            this.max_toxicity = max_toxicity;
            return this;
        }
        
        public Builder max_unsubstantial(final Double max_unsubstantial) {
            this.max_unsubstantial = max_unsubstantial;
            return this;
        }
        
        public Builder obscene(final Double obscene) {
            this.obscene = obscene;
            return this;
        }
        
        public Builder profanity(final Double profanity) {
            this.profanity = profanity;
            return this;
        }
        
        public void reset() {
            this.collapse_reasons = null;
            this.toxicity = null;
            this.severe_toxicity = null;
            this.insult = null;
            this.profanity = null;
            this.sexually_explicit = null;
            this.threat = null;
            this.flirtation = null;
            this.attack_on_author = null;
            this.attack_on_commenter = null;
            this.incoherent = null;
            this.inflammatory = null;
            this.likely_to_reject = null;
            this.obscene = null;
            this.spam = null;
            this.unsubstantial = null;
            this.identity_attack = null;
            this.id = null;
            this.max_toxicity = null;
            this.max_severe_toxicity = null;
            this.max_insult = null;
            this.max_profanity = null;
            this.max_sexually_explicit = null;
            this.max_threat = null;
            this.max_flirtation = null;
            this.max_attack_on_author = null;
            this.max_attack_on_commenter = null;
            this.max_incoherent = null;
            this.max_inflammatory = null;
            this.max_likely_to_reject = null;
            this.max_obscene = null;
            this.max_spam = null;
            this.max_unsubstantial = null;
            this.max_identity_attack = null;
        }
        
        public Builder severe_toxicity(final Double severe_toxicity) {
            this.severe_toxicity = severe_toxicity;
            return this;
        }
        
        public Builder sexually_explicit(final Double sexually_explicit) {
            this.sexually_explicit = sexually_explicit;
            return this;
        }
        
        public Builder spam(final Double spam) {
            this.spam = spam;
            return this;
        }
        
        public Builder threat(final Double threat) {
            this.threat = threat;
            return this;
        }
        
        public Builder toxicity(final Double toxicity) {
            this.toxicity = toxicity;
            return this;
        }
        
        public Builder unsubstantial(final Double unsubstantial) {
            this.unsubstantial = unsubstantial;
            return this;
        }
    }
    
    public static final class PerspectiveAdapter implements a<Perspective, Builder>
    {
        private PerspectiveAdapter() {
        }
        
        public PerspectiveAdapter(final Perspective$1 object) {
            this();
        }
        
        public Perspective read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Perspective read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 50) {
                        if (b != 51) {
                            switch (b) {
                                default: {
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 83: {
                                    if (a == 4) {
                                        builder.max_identity_attack(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 82: {
                                    if (a == 4) {
                                        builder.max_unsubstantial(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 81: {
                                    if (a == 4) {
                                        builder.max_spam(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 80: {
                                    if (a == 4) {
                                        builder.max_obscene(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 79: {
                                    if (a == 4) {
                                        builder.max_likely_to_reject(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 78: {
                                    if (a == 4) {
                                        builder.max_inflammatory(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 77: {
                                    if (a == 4) {
                                        builder.max_incoherent(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 76: {
                                    if (a == 4) {
                                        builder.max_attack_on_commenter(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 75: {
                                    if (a == 4) {
                                        builder.max_attack_on_author(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 74: {
                                    if (a == 4) {
                                        builder.max_flirtation(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 73: {
                                    if (a == 4) {
                                        builder.max_threat(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 72: {
                                    if (a == 4) {
                                        builder.max_sexually_explicit(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 71: {
                                    if (a == 4) {
                                        builder.max_profanity(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 70: {
                                    if (a == 4) {
                                        builder.max_insult(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 69: {
                                    if (a == 4) {
                                        builder.max_severe_toxicity(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 68: {
                                    if (a == 4) {
                                        builder.max_toxicity(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 67: {
                                    if (a == 11) {
                                        builder.id(e.F());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 66: {
                                    if (a == 4) {
                                        builder.identity_attack(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 65: {
                                    if (a == 4) {
                                        builder.unsubstantial(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 64: {
                                    if (a == 4) {
                                        builder.spam(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 63: {
                                    if (a == 4) {
                                        builder.obscene(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 62: {
                                    if (a == 4) {
                                        builder.likely_to_reject(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 61: {
                                    if (a == 4) {
                                        builder.inflammatory(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 60: {
                                    if (a == 4) {
                                        builder.incoherent(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 59: {
                                    if (a == 4) {
                                        builder.attack_on_commenter(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 58: {
                                    if (a == 4) {
                                        builder.attack_on_author(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 57: {
                                    if (a == 4) {
                                        builder.flirtation(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 56: {
                                    if (a == 4) {
                                        builder.threat(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 55: {
                                    if (a == 4) {
                                        builder.sexually_explicit(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 54: {
                                    if (a == 4) {
                                        builder.profanity(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                                case 53: {
                                    if (a == 4) {
                                        builder.insult(e.h());
                                        break;
                                    }
                                    ht.a.a(e, a);
                                    break;
                                }
                            }
                        }
                        else if (a == 4) {
                            builder.severe_toxicity(e.h());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 4) {
                        builder.toxicity(e.h());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 15) {
                    final c w = e.w();
                    final ArrayList list = new ArrayList(w.b);
                    for (int i = 0; i < w.b; i = k.f(e, list, i, 1)) {}
                    e.x();
                    builder.collapse_reasons((List<String>)list);
                }
                else {
                    ht.a.a(e, a);
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
        
        public void write(final e e, final Perspective perspective) throws IOException {
            e.X();
            if (perspective.collapse_reasons != null) {
                e.O(1, (byte)15);
                e.U((byte)11, perspective.collapse_reasons.size());
                final Iterator<String> iterator = perspective.collapse_reasons.iterator();
                while (iterator.hasNext()) {
                    e.W((String)iterator.next());
                }
                e.V();
                e.P();
            }
            if (perspective.toxicity != null) {
                e.O(50, (byte)4);
                d.z(perspective.toxicity, e);
            }
            if (perspective.severe_toxicity != null) {
                e.O(51, (byte)4);
                d.z(perspective.severe_toxicity, e);
            }
            if (perspective.insult != null) {
                e.O(53, (byte)4);
                d.z(perspective.insult, e);
            }
            if (perspective.profanity != null) {
                e.O(54, (byte)4);
                d.z(perspective.profanity, e);
            }
            if (perspective.sexually_explicit != null) {
                e.O(55, (byte)4);
                d.z(perspective.sexually_explicit, e);
            }
            if (perspective.threat != null) {
                e.O(56, (byte)4);
                d.z(perspective.threat, e);
            }
            if (perspective.flirtation != null) {
                e.O(57, (byte)4);
                d.z(perspective.flirtation, e);
            }
            if (perspective.attack_on_author != null) {
                e.O(58, (byte)4);
                d.z(perspective.attack_on_author, e);
            }
            if (perspective.attack_on_commenter != null) {
                e.O(59, (byte)4);
                d.z(perspective.attack_on_commenter, e);
            }
            if (perspective.incoherent != null) {
                e.O(60, (byte)4);
                d.z(perspective.incoherent, e);
            }
            if (perspective.inflammatory != null) {
                e.O(61, (byte)4);
                d.z(perspective.inflammatory, e);
            }
            if (perspective.likely_to_reject != null) {
                e.O(62, (byte)4);
                d.z(perspective.likely_to_reject, e);
            }
            if (perspective.obscene != null) {
                e.O(63, (byte)4);
                d.z(perspective.obscene, e);
            }
            if (perspective.spam != null) {
                e.O(64, (byte)4);
                d.z(perspective.spam, e);
            }
            if (perspective.unsubstantial != null) {
                e.O(65, (byte)4);
                d.z(perspective.unsubstantial, e);
            }
            if (perspective.identity_attack != null) {
                e.O(66, (byte)4);
                d.z(perspective.identity_attack, e);
            }
            if (perspective.id != null) {
                e.O(67, (byte)11);
                e.W(perspective.id);
                e.P();
            }
            if (perspective.max_toxicity != null) {
                e.O(68, (byte)4);
                d.z(perspective.max_toxicity, e);
            }
            if (perspective.max_severe_toxicity != null) {
                e.O(69, (byte)4);
                d.z(perspective.max_severe_toxicity, e);
            }
            if (perspective.max_insult != null) {
                e.O(70, (byte)4);
                d.z(perspective.max_insult, e);
            }
            if (perspective.max_profanity != null) {
                e.O(71, (byte)4);
                d.z(perspective.max_profanity, e);
            }
            if (perspective.max_sexually_explicit != null) {
                e.O(72, (byte)4);
                d.z(perspective.max_sexually_explicit, e);
            }
            if (perspective.max_threat != null) {
                e.O(73, (byte)4);
                d.z(perspective.max_threat, e);
            }
            if (perspective.max_flirtation != null) {
                e.O(74, (byte)4);
                d.z(perspective.max_flirtation, e);
            }
            if (perspective.max_attack_on_author != null) {
                e.O(75, (byte)4);
                d.z(perspective.max_attack_on_author, e);
            }
            if (perspective.max_attack_on_commenter != null) {
                e.O(76, (byte)4);
                d.z(perspective.max_attack_on_commenter, e);
            }
            if (perspective.max_incoherent != null) {
                e.O(77, (byte)4);
                d.z(perspective.max_incoherent, e);
            }
            if (perspective.max_inflammatory != null) {
                e.O(78, (byte)4);
                d.z(perspective.max_inflammatory, e);
            }
            if (perspective.max_likely_to_reject != null) {
                e.O(79, (byte)4);
                d.z(perspective.max_likely_to_reject, e);
            }
            if (perspective.max_obscene != null) {
                e.O(80, (byte)4);
                d.z(perspective.max_obscene, e);
            }
            if (perspective.max_spam != null) {
                e.O(81, (byte)4);
                d.z(perspective.max_spam, e);
            }
            if (perspective.max_unsubstantial != null) {
                e.O(82, (byte)4);
                d.z(perspective.max_unsubstantial, e);
            }
            if (perspective.max_identity_attack != null) {
                e.O(83, (byte)4);
                d.z(perspective.max_identity_attack, e);
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Perspective)o);
        }
    }
}
