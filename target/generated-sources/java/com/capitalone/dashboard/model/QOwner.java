package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOwner is a Querydsl query type for Owner
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QOwner extends BeanPath<Owner> {

    private static final long serialVersionUID = 1432006673L;

    public static final QOwner owner = new QOwner("owner");

    public final EnumPath<AuthType> authType = createEnum("authType", AuthType.class);

    public final StringPath username = createString("username");

    public QOwner(String variable) {
        super(Owner.class, forVariable(variable));
    }

    public QOwner(Path<? extends Owner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOwner(PathMetadata metadata) {
        super(Owner.class, metadata);
    }

}

