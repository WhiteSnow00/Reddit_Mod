// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Api
{
    public static final a<Api, Api.Api$Builder> ADAPTER;
    public final String address;
    public final String endpoint;
    public final String name;
    
    static {
        ADAPTER = (a)new Api.Api$ApiAdapter((Api$1)null);
    }
    
    private Api(final Api.Api$Builder api$Builder) {
        this.name = Api.Api$Builder.access$100(api$Builder);
        this.address = Api.Api$Builder.access$200(api$Builder);
        this.endpoint = Api.Api$Builder.access$300(api$Builder);
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
        if (!(o instanceof Api)) {
            return false;
        }
        final Api api = (Api)o;
        final String name = this.name;
        final String name2 = api.name;
        if (name == name2 || (name != null && name.equals(name2))) {
            final String address = this.address;
            final String address2 = api.address;
            if (address == address2 || (address != null && address.equals(address2))) {
                final String endpoint = this.endpoint;
                final String endpoint2 = api.endpoint;
                boolean b2 = b;
                if (endpoint == endpoint2) {
                    return b2;
                }
                if (endpoint != null && endpoint.equals(endpoint2)) {
                    b2 = b;
                    return b2;
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
        final String address = this.address;
        int hashCode3;
        if (address == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = address.hashCode();
        }
        final String endpoint = this.endpoint;
        if (endpoint != null) {
            hashCode = endpoint.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Api{name=");
        k.append(this.name);
        k.append(", address=");
        k.append(this.address);
        k.append(", endpoint=");
        return b.j(k, this.endpoint, "}");
    }
    
    public void write(final e e) throws IOException {
        Api.ADAPTER.write(e, (Object)this);
    }
}
