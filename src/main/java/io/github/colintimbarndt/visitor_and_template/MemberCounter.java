package io.github.colintimbarndt.visitor_and_template;

public class MemberCounter extends MemberVisitor<Integer> {
    public static final MemberCounter INSTANCE = new MemberCounter();

    private MemberCounter() {}

    @Override
    protected Integer combine(Integer left, Integer right) {
        return left + right;
    }

    @Override
    protected Integer visit(Member m) {
        return 1;
    }

    @Override
    protected Integer getEmpty() {
        return 0;
    }
}
