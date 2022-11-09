// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import java.util.Iterator;
import com.facebook.stetho.common.Util;
import java.util.IdentityHashMap;
import java.util.Map;

public final class DescriptorMap implements DescriptorRegistrar
{
    private Descriptor.Host mHost;
    private boolean mIsInitializing;
    private final Map<Class<?>, Descriptor> mMap;
    
    public DescriptorMap() {
        this.mMap = new IdentityHashMap<Class<?>, Descriptor>();
    }
    
    private Descriptor getImpl(Class<?> superclass) {
        while (superclass != null) {
            final Descriptor descriptor = this.mMap.get(superclass);
            if (descriptor != null) {
                return descriptor;
            }
            superclass = superclass.getSuperclass();
        }
        return null;
    }
    
    public DescriptorMap beginInit() {
        Util.throwIf(this.mIsInitializing);
        this.mIsInitializing = true;
        return this;
    }
    
    public DescriptorMap endInit() {
        Util.throwIfNot(this.mIsInitializing);
        Util.throwIfNull(this.mHost);
        this.mIsInitializing = false;
        for (final Class clazz : this.mMap.keySet()) {
            final Descriptor descriptor = this.mMap.get(clazz);
            if (descriptor instanceof ChainedDescriptor) {
                ((ChainedDescriptor)descriptor).setSuper(this.getImpl(clazz.getSuperclass()));
            }
            descriptor.initialize(this.mHost);
        }
        return this;
    }
    
    public Descriptor get(final Class<?> clazz) {
        Util.throwIfNull(clazz);
        Util.throwIf(this.mIsInitializing);
        return this.getImpl(clazz);
    }
    
    @Override
    public DescriptorMap registerDescriptor(final Class<?> clazz, final Descriptor descriptor) {
        Util.throwIfNull(clazz);
        Util.throwIfNull(descriptor);
        Util.throwIf(descriptor.isInitialized());
        Util.throwIfNot(this.mIsInitializing);
        if (this.mMap.containsKey(clazz)) {
            throw new UnsupportedOperationException();
        }
        if (!this.mMap.containsValue(descriptor)) {
            this.mMap.put(clazz, descriptor);
            return this;
        }
        throw new UnsupportedOperationException();
    }
    
    public DescriptorMap setHost(final Descriptor.Host mHost) {
        Util.throwIfNull(mHost);
        Util.throwIfNot(this.mIsInitializing);
        Util.throwIfNotNull(this.mHost);
        this.mHost = mHost;
        return this;
    }
}
