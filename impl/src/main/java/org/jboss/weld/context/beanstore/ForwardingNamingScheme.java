package org.jboss.weld.context.beanstore;

import java.util.Collection;

public abstract class ForwardingNamingScheme implements NamingScheme {

    protected abstract NamingScheme delegate();

    public boolean accept(String id) {
        return delegate().accept(id);
    }

    public String deprefix(String id) {
        return delegate().deprefix(id);
    }

    public String prefix(String id) {
        return delegate().prefix(id);
    }

    public Collection<String> filterIds(Collection<String> ids) {
        return delegate().filterIds(ids);
    }

    public Collection<String> deprefix(Collection<String> ids) {
        return delegate().deprefix(ids);
    }

    public Collection<String> prefix(Collection<String> ids) {
        return delegate().prefix(ids);
    }

    @Override
    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override
    public int hashCode() {
        return delegate().hashCode();
    }

    public String toString() {
        return delegate().toString();
    }

}
