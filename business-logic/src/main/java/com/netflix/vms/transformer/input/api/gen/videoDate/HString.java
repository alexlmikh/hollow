package com.netflix.vms.transformer.input.api.gen.videoDate;

import com.netflix.hollow.api.objects.HollowObject;

@SuppressWarnings("all")
public class HString extends HollowObject {

    public HString(StringDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public String getValue() {
        return delegate().getValue(ordinal);
    }

    public boolean isValueEqual(String testValue) {
        return delegate().isValueEqual(ordinal, testValue);
    }

    public VideoDateAPI api() {
        return typeApi().getAPI();
    }

    public StringTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected StringDelegate delegate() {
        return (StringDelegate)delegate;
    }

}