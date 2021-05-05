package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLibraryPolicyReference is a Querydsl query type for LibraryPolicyReference
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLibraryPolicyReference extends EntityPathBase<LibraryPolicyReference> {

    private static final long serialVersionUID = 124289632L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLibraryPolicyReference libraryPolicyReference = new QLibraryPolicyReference("libraryPolicyReference");

    public final QBaseModel _super;

    public final StringPath changeClass = createString("changeClass");

    //inherited
    public final StringPath clientReference;

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath language = createString("language");

    public final NumberPath<Long> lastUpdated = createNumber("lastUpdated", Long.class);

    public final StringPath libraryName = createString("libraryName");

    public final StringPath operator = createString("operator");

    public final StringPath orgName = createString("orgName");

    public final ListPath<WhiteSourceComponent, QWhiteSourceComponent> projectReferences = this.<WhiteSourceComponent, QWhiteSourceComponent>createList("projectReferences", WhiteSourceComponent.class, QWhiteSourceComponent.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath userEmail = createString("userEmail");

    public QLibraryPolicyReference(String variable) {
        this(LibraryPolicyReference.class, forVariable(variable), INITS);
    }

    public QLibraryPolicyReference(Path<? extends LibraryPolicyReference> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLibraryPolicyReference(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLibraryPolicyReference(PathMetadata metadata, PathInits inits) {
        this(LibraryPolicyReference.class, metadata, inits);
    }

    public QLibraryPolicyReference(Class<? extends LibraryPolicyReference> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

