package org.openstack4j.openstack.trove.builder;

import org.openstack4j.model.trove.builder.DBServiceBuilders;
import org.openstack4j.model.trove.builder.DatabaseBuilder;
import org.openstack4j.model.trove.builder.InstanceCreateBuilder;
import org.openstack4j.openstack.trove.domain.TroveInstanceCreate;

/**
 * Databse service builders
 *
 * @author Shital Patil
 */

public class TroveBuilders implements DBServiceBuilders {

    @Override
    public InstanceCreateBuilder instanceCreate() {
        return TroveInstanceCreate.builder();
    }

    @Override
    public DatabaseBuilder databaseCreate() {
        // TODO Auto-generated method stub
        return null;
    }

}
