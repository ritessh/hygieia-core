package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QComment is a Querydsl query type for Comment
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QComment extends BeanPath<Comment> {

    private static final long serialVersionUID = -520958915L;

    public static final QComment comment = new QComment("comment");

    public final StringPath body = createString("body");

    public final NumberPath<Long> createdAt = createNumber("createdAt", Long.class);

    public final StringPath status = createString("status");

    public final NumberPath<Long> updatedAt = createNumber("updatedAt", Long.class);

    public final StringPath user = createString("user");

    public final StringPath userLDAPDN = createString("userLDAPDN");

    public final StringPath userType = createString("userType");

    public QComment(String variable) {
        super(Comment.class, forVariable(variable));
    }

    public QComment(Path<? extends Comment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComment(PathMetadata metadata) {
        super(Comment.class, metadata);
    }

}

