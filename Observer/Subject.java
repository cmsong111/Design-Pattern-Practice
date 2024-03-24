interface Subject {
    registerObserver(); // 옵저버 등록

    removeObserver(); // 옵저버 삭제

    notifyObserver(); // 옵저버에게 업데이트 알림
}
