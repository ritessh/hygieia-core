package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConfiguration is a Querydsl query type for Configuration
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConfiguration extends EntityPathBase<Configuration> {

    private static final long serialVersionUID = 1397617748L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConfiguration configuration = new QConfiguration("configuration");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    public final StringPath collectorName = createString("collectorName");

    // inherited
    public final org.bson.types.QObjectId id;

    public final SetPath<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>> info = this.<java.util.Map<String, String>, SimplePath<java.util.Map<String, String>>>createSet("info", java.util.Map.class, SimplePath.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QConfiguration(String variable) {
        this(Configuration.class, forVariable(variable), INITS);
    }

    public QConfiguration(Path<? extends Configuration> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConfiguration(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConfiguration(PathMetadata metadata, PathInits inits) {
        this(Configuration.class, metadata, inits);
    }

    public QConfiguration(Class<? extends Configuration> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

