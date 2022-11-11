// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogressv2;

import se2.d;

public final class NewCommunityProgressV2UiMapper_Factory implements d<NewCommunityProgressV2UiMapper>
{
    public static NewCommunityProgressV2UiMapper_Factory create() {
        return InstanceHolder.access$000();
    }
    
    public static NewCommunityProgressV2UiMapper newInstance() {
        return new NewCommunityProgressV2UiMapper();
    }
    
    public NewCommunityProgressV2UiMapper get() {
        return newInstance();
    }
    
    public static final class InstanceHolder
    {
        private static final NewCommunityProgressV2UiMapper_Factory INSTANCE;
        
        static {
            INSTANCE = new NewCommunityProgressV2UiMapper_Factory();
        }
        
        private InstanceHolder() {
        }
        
        public static /* synthetic */ NewCommunityProgressV2UiMapper_Factory access$000() {
            return InstanceHolder.INSTANCE;
        }
    }
}
