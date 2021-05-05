package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAutoDiscoveredEntry is a Querydsl query type for AutoDiscoveredEntry
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAutoDiscoveredEntry extends BeanPath<AutoDiscoveredEntry> {

    private static final long serialVersionUID = -1064403399L;

    public static final QAutoDiscoveredEntry autoDiscoveredEntry = new QAutoDiscoveredEntry("autoDiscoveredEntry");

    public final StringPath description = createString("description");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath niceName = createString("niceName");

    public final MapPath<String, Object, SimplePath<Object>> options = this.<String, Object, SimplePath<Object>>createMap("options", String.class, Object.class, SimplePath.class);

    public final BooleanPath pushed = createBoolean("pushed");

    public final EnumPath<AutoDiscoveryStatusType> status = createEnum("status", AutoDiscoveryStatusType.class);

    public final StringPath toolName = createString("toolName");

    public QAutoDiscoveredEntry(String variable) {
        super(AutoDiscoveredEntry.class, forVariable(variable));
    }

    public QAutoDiscoveredEntry(Path<? extends AutoDiscoveredEntry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAutoDiscoveredEntry(PathMetadata metadata) {
        super(AutoDiscoveredEntry.class, metadata);
    }

}

