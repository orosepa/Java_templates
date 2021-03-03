package com.task6.abstract_factory;

interface CakeFactory {
    BigSize createBigCake();
    OnePiece createOnePiece();
}
class CheeseCakeFactory implements CakeFactory {

    @Override
    public BigSize createBigCake() {
        return new BigSizeCheeseCake();
    }

    @Override
    public OnePiece createOnePiece() {
        return new OnePieceCheeseCake();
    }
}
class ChocolateCakeFactory implements CakeFactory {
    @Override
    public BigSize createBigCake() {
        return new BigSizeChocolateCake();
    }

    @Override
    public OnePiece createOnePiece() {
        return new OnePieceChocolateCake();
    }
}
interface BigSize {}
interface OnePiece {}

class BigSizeCheeseCake implements BigSize {
    public BigSizeCheeseCake() {
        System.out.println("Big Size Cheesecake");
    }
}
class BigSizeChocolateCake implements BigSize {
    public BigSizeChocolateCake() {
        System.out.println("Big Size Chocolate Cake");
    }
}
class OnePieceCheeseCake implements OnePiece {
    public OnePieceCheeseCake() {
        System.out.println("One Piece Cheesecake");
    }
}
class OnePieceChocolateCake implements OnePiece {
    public OnePieceChocolateCake() {
        System.out.println("One Piece Chocolate Cake");
    }
}
