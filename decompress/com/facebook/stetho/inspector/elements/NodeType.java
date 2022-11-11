// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.json.annotation.JsonValue;

public enum NodeType
{
    COMMENT_NODE(8), 
    DOCUMENT_FRAGMENT_NODE(11), 
    DOCUMENT_NODE(9), 
    DOCUMENT_TYPE_NODE(10), 
    ELEMENT_NODE(1), 
    PROCESSING_INSTRUCTION_NODE(7), 
    TEXT_NODE(3);
    
    private final int mValue;
    
    private NodeType(final int mValue) {
        this.mValue = mValue;
    }
    
    @JsonValue
    public int getProtocolValue() {
        return this.mValue;
    }
}
