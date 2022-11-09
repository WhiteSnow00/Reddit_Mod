// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Automoderator
{
    public static final a<Automoderator, Automoderator.Automoderator$Builder> ADAPTER;
    public final String rule_hash_id;
    public final String rule_yaml;
    
    static {
        ADAPTER = (a)new Automoderator.Automoderator$AutomoderatorAdapter((Automoderator$1)null);
    }
    
    private Automoderator(final Automoderator.Automoderator$Builder automoderator$Builder) {
        this.rule_yaml = Automoderator.Automoderator$Builder.access$100(automoderator$Builder);
        this.rule_hash_id = Automoderator.Automoderator$Builder.access$200(automoderator$Builder);
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
        if (!(o instanceof Automoderator)) {
            return false;
        }
        final Automoderator automoderator = (Automoderator)o;
        final String rule_yaml = this.rule_yaml;
        final String rule_yaml2 = automoderator.rule_yaml;
        if (rule_yaml == rule_yaml2 || (rule_yaml != null && rule_yaml.equals(rule_yaml2))) {
            final String rule_hash_id = this.rule_hash_id;
            final String rule_hash_id2 = automoderator.rule_hash_id;
            boolean b2 = b;
            if (rule_hash_id == rule_hash_id2) {
                return b2;
            }
            if (rule_hash_id != null && rule_hash_id.equals(rule_hash_id2)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String rule_yaml = this.rule_yaml;
        int hashCode = 0;
        int hashCode2;
        if (rule_yaml == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = rule_yaml.hashCode();
        }
        final String rule_hash_id = this.rule_hash_id;
        if (rule_hash_id != null) {
            hashCode = rule_hash_id.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Automoderator{rule_yaml=");
        k.append(this.rule_yaml);
        k.append(", rule_hash_id=");
        return b.j(k, this.rule_hash_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Automoderator.ADAPTER.write(e, (Object)this);
    }
}
