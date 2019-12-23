import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CretaeComponent } from './cretae.component';

describe('CretaeComponent', () => {
  let component: CretaeComponent;
  let fixture: ComponentFixture<CretaeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CretaeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CretaeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
